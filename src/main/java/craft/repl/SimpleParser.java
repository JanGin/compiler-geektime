package craft.repl;

import craft.base.ASTNode;
import craft.base.ASTNodeType;
import craft.base.SimpleASTNode;
import craft.base.Token;
import craft.exception.MyParseException;
import craft.lexer.SimpleLexer;
import craft.util.ASTNodeUtil;
import craft.util.TokenReader;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static craft.util.TokenUtil.*;

public class SimpleParser {

    private Map<String, Integer> variableTable = new HashMap<>();

    private boolean verbose = false;

    public SimpleParser(boolean verbose) {
        this.verbose = verbose;
    }


    /**
     * 解析输入的script, 返回AST的根结点
     * @param script    input text
     */
    public SimpleASTNode parse(String script) throws MyParseException {
        SimpleLexer lexer = new SimpleLexer();
        TokenReader stream = lexer.tokenize(script);
        SimpleASTNode root = program(stream);
        return root;
    }


    /**
     * 程序入口
     * @param stream    token stream
     * @return
     */
    private SimpleASTNode program(TokenReader stream) throws MyParseException {

        SimpleASTNode root = new SimpleASTNode(ASTNodeType.Program, "pwc");
        while (Objects.nonNull(stream.peek())) {
            SimpleASTNode node = intDeclaration(stream);
            if (Objects.isNull(node)) {
                node = expressionStmt(stream);
            }

            if (Objects.isNull(node)) {
                node = assignmentStmt(stream);
            }

            if (Objects.nonNull(node)) {
                root.addChild(node);
            } else {
                throw new MyParseException("Unknown statement!");
            }
        }

        return root;
    }

    public SimpleASTNode assignmentStmt(TokenReader stream) throws MyParseException {
        SimpleASTNode node = null;
        Token token = stream.peek();
        if (isIdentifier(token)) {
            stream.read();
            node = new SimpleASTNode(ASTNodeType.AssignmentStmt, node.getText());
            token = stream.peek();
            if (isAssignment(token)) {
                stream.read();
                SimpleASTNode child = additive(stream);
                if (Objects.isNull(child)) {
                    throw new MyParseException("Invalid assignment expression, expression is expected");
                }
                node.addChild(child);
                token = stream.peek();
                if (isSemiColon(token)) {
                    stream.read();
                } else {
                    throw new MyParseException("Invalid statement, semicolon ';' is excepted");
                }
            } else {
                stream.unread();        //backtrace
                node = null;
            }
        }

        return node;
    }

    public SimpleASTNode expressionStmt(TokenReader stream) throws MyParseException {
        int position = stream.getPosition();    //记下当前位置，便于回溯
        SimpleASTNode node = additive(stream);
        if (Objects.nonNull(node)) {
            if (isSemiColon(stream.peek())) {
                stream.read();
            } else {
                stream.setPosition(position);
                node = null;
            }
        }
        return node;
    }

    /**
     * 解析基础表达式
     * @param stream    token stream
     * @return
     * @throws MyParseException
     */
    public SimpleASTNode primary(TokenReader stream) throws MyParseException {
        SimpleASTNode node = null;
        Token token = stream.peek();
        if (isIdentifier(token)) {
            token = stream.read();
            node = new SimpleASTNode(ASTNodeType.Identifier, token.getTokenText());
        } else if (isIntLiteral(token)) {
            token = stream.read();
            node = new SimpleASTNode(ASTNodeType.IntLiteral, token.getTokenText());
        } else if (isLeftBracket(token)) {
            stream.read();
            node = additive(stream);

            if (Objects.nonNull(node)) {
                token = stream.peek();      //继续往下解析
                if (isRightBracket(token)) {
                    stream.read();
                } else {
                    throw new MyParseException("expect right bracket ')' here");
                }
            } else {
                throw new MyParseException("expect additive expression in brackets");
            }

        }
        return node;
    }

    /**
     * 解析加法表达式
     * @param stream    token stream
     * @return
     */
    public SimpleASTNode additive(TokenReader stream) throws MyParseException {

        // 文法   add :=  mul (+ mul)*
        // 也即 add := mul | add'
        //     add' := + mul add' | ε (epsilon)
        // 采用非递归方式消除左递归带来的结合性问题
        SimpleASTNode child1 = multiplicative(stream);
        SimpleASTNode node = child1;
        if (Objects.nonNull(child1)) {
            while (true) {
                //循环运用 mul (+ mul)* 中的   (+ mul)*
                Token token = stream.peek();
                if (isPlus(token) || isMinus(token)) {
                    token = stream.read();
                    SimpleASTNode child2 = multiplicative(stream);
                    node = new SimpleASTNode(ASTNodeType.AdditiveExpr, token.getTokenText());
                    node.addChild(child1);      //新节点在顶层，以确保结合性
                    node.addChild(child2);
                    child1 = node;
                } else {
                    break;
                }
            }
        }

        return node;
    }


    /**
     * 解析乘除法表达式
     * @param stream    token stream
     * @return
     */
    public SimpleASTNode multiplicative(TokenReader stream) throws MyParseException {
        SimpleASTNode child1 = primary(stream);
        //
        SimpleASTNode node = child1;
        Token token = stream.peek();
        if (Objects.nonNull(child1) && Objects.nonNull(token)) {
            if (isMultiple(token) || isDivide(token)) {
                token = stream.read();
                SimpleASTNode child2 = primary(stream);
                if (Objects.nonNull(child2)) {
                    node = new SimpleASTNode(ASTNodeType.MultiplicativeExpr, token.getTokenText());
                    node.addChild(child1);
                    node.addChild(child2);
                } else {
                    String symbol;
                    if (isMultiple(token))
                        symbol = "*";
                    else
                        symbol = "/";
                    throw new MyParseException("Invalid expression, expect right part of the expression after '" + symbol + "' here");
                }
            }
        }
        return node;
    }

    /**
     * 整型表达式
     * @param stream  token stream
     * @return
     */
    public SimpleASTNode intDeclaration(TokenReader stream) throws MyParseException {
        SimpleASTNode node = null;
        Token token = stream.peek();        //预读
        if (isInt(token)) {
            stream.read();          //读出int
            if (isIdentifier(stream.peek())) {    //接着读
                token = stream.read();      //读出标识符
                /*此处只建立表达式子节点*/
                node = new SimpleASTNode(ASTNodeType.IntDeclaration, token.getTokenText());
                if (isAssignment(stream.peek())) {
                    stream.read();   //读出 =
                    SimpleASTNode child = additive(stream);   //此处期待一个表达式，并返回一个AST节点
                    if (Objects.nonNull(child)) {
                        node.addChild(child);
                    } else {
                        throw new MyParseException("Invalid variable initialization, expression statement is expected");
                    }
                }
            } else {
                throw new MyParseException("Invalid int statement declaration, variable name is expected");
            }

            if (Objects.nonNull(node)) {
                // 读取 ;
                stream.peek();
                if (isSemiColon(stream.peek())) {
                    stream.read();
                } else {
                    throw new MyParseException("Invalid statement, semicolon ';' is excepted");
                }
            }

        }
        return node;
    }

    /**
     * 计算某个节点的值
     * @return
     */
    public int eval(ASTNode node, String indent) throws MyParseException {
        int result = 0;
        int res1 = 0, res2 = 0;
        switch(node.getType()) {
            case Program:
                for (ASTNode child : node.children()) {
                    result = eval(child, indent + "\t");
                }
                break;
            case AdditiveExpr:
                res1 = eval(node.children().get(0), indent + "\t");
                res2 = eval(node.children().get(1), indent + "\t");
                if ("+".equals(node.getText())) {
                    result = res1 + res2;
                } else {
                    result = res1 - res2;
                }
                break;
            case MultiplicativeExpr:
                res1 = eval(node.children().get(0), indent + "\t");
                res2 = eval(node.children().get(1), indent + "\t");
                if ("*".equals(node.getText())) {
                    result = res1 * res2;
                } else {
                    result = res1 / res2;
                }
                break;
            case IntLiteral:
                result = Integer.valueOf(node.getText()).intValue();
                break;
            case Identifier:
                String var = node.getText();
                if (!variableTable.containsKey(var)) {
                    throw new MyParseException(var+" is undefined.");
                }
                Integer val = variableTable.get(var);
                if (Objects.isNull(val)) {
                    throw new MyParseException(var+" has not been initialized");
                }
                result = val.intValue();
                break;
            case AssignmentStmt:
                var = node.getText();
                if (!variableTable.containsKey(var)) {
                    throw new MyParseException(var+" is undefined");
                }
            case IntDeclaration:
                var = node.getText();
                val = null;
                if (Objects.nonNull(node.children()) && node.children().size() > 0) {
                    ASTNode child = node.children().get(0);
                    result = eval(child, indent+"\t");
                    val = Integer.valueOf(result).intValue();
                }
                variableTable.put(var, val);
                break;
            default:
                break;
        }

        if (verbose) {
            System.out.println(indent + "Result: " + result);
        } else if ("".equals(node.getText().trim())) {     //顶层语句
            if (ASTNodeUtil.isAssignmentStmt(node) || ASTNodeUtil.isIntDeclarationStmt(node)) {
                System.out.println(node.getText() + " : " + result);
            } else if (ASTNodeUtil.isProgram(node)) {
                System.out.println(result);
            }
        }
        return  result;
    }


    public void dumpText(ASTNode node, String indent) {
        System.out.println(indent + node.getType() + ":" + node.getText());
        for (ASTNode child : node.children()) {
            dumpText(child, indent + "\t");
        }
    }
}
