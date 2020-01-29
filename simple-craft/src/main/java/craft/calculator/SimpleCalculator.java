package craft.calculator;

import craft.base.ASTNode;
import craft.base.ASTNodeType;
import craft.base.SimpleASTNode;
import craft.base.Token;
import craft.exception.MyParseException;
import craft.lexer.SimpleLexer;
import craft.util.TokenReader;
import craft.util.TokenUtil;

import java.util.Objects;

/**
 *  该class所使用的语法规则：
 *   additive -> multiplicative | multiplicative + additive
 *   multiplicative -> primary | primary * multiplicative
 */
public class SimpleCalculator {


    public static void main(String[] args) throws MyParseException {
        SimpleLexer lexer = new SimpleLexer();
        SimpleCalculator cal = new SimpleCalculator();
        //String script1 = "int a = b + 2;";
        //TokenReader tokenReader = lexer.tokenize(script1);
        /*System.out.println("script1词法解析结果：");
        lexer.dumpText(tokenReader);
        tokenReader.setPosition(0);
        */
        //SimpleASTNode node = cal.intDeclaration(tokenReader);
        //cal.dumpText(node, "");
        //String script2 = "2 + 3 * 6";
        //tokenReader = lexer.tokenize(script2);
        //System.out.println("script2词法解析结果：");
        //lexer.dumpText(tokenReader);
        //tokenReader.setPosition(0);
        //SimpleASTNode node2 = cal.additive(tokenReader);
        //cal.dumpText(node2, "");

        //String script3 = "2 + 3 * 5";         //Result: 17
        String script3 = "1 + 2 + 3";           //DoneFIXME 此处有结合性问题，先算得5，再算得6
        String script7 = "1 + 2 + 3 + 4";
        //TokenReader tokenReader = lexer.tokenize(script7);
        //SimpleASTNode node7 = cal.additive(tokenReader);
        //cal.dumpText(node7, "");
        cal.eval(script7);

        /*以下测试异常状况*/

        String script4 = "2 +";         //expect right part of the expression after '+' here
        //tokenReader = lexer.tokenize(script4);
        //SimpleASTNode node4 = cal.additive(tokenReader);
        //cal.dumpText(node4, "");

        String script5 = "2 *";       //expect right part of the expression after '*' here
        //tokenReader = lexer.tokenize(script5);
        //SimpleASTNode node5 = cal.additive(tokenReader);
        //cal.dumpText(node5, "");


        String script6 = "int a = b + 2";     //Invalid statement, semicolon ';' is excepted
        //tokenReader = lexer.tokenize(script6);
        //SimpleASTNode node6 = cal.intDeclaration(tokenReader);
        //cal.dumpText(node6, "");
    }

    /**
     * 计算表达式的值，并输出AST和计算过程
     * @param script    input text
     */
    public void eval(String script) throws MyParseException {
        SimpleASTNode tree = parse(script);
        dumpText(tree, "");
        calculate(tree, "");
    }


    /**
     * 解析输入的script, 返回AST的根结点
     * @param script    input text
     */
    private SimpleASTNode parse(String script) throws MyParseException {
        SimpleLexer lexer = new SimpleLexer();
        TokenReader reader = lexer.tokenize(script);
        SimpleASTNode root = buildASTRoot(reader);
        return root;
    }


    /**
     * 构造程序AST的根结点
     * @param reader    token stream
     * @return
     */
    public SimpleASTNode buildASTRoot(TokenReader reader) throws MyParseException {

        SimpleASTNode root = new SimpleASTNode(ASTNodeType.Program, "SimpleCalculator");
        SimpleASTNode child = additive(reader);
        if (Objects.nonNull(child))
            root.addChild(child);

        return root;
    }

    /**
     * 解析基础表达式
     * @param reader    token stream
     * @return
     * @throws MyParseException
     */
    public SimpleASTNode primary(TokenReader reader) throws MyParseException {
        SimpleASTNode node = null;
        Token token = reader.peek();
        if (TokenUtil.isIdentifier(token)) {
            token = reader.read();
            node = new SimpleASTNode(ASTNodeType.Identifier, token.getTokenText());
        } else if (TokenUtil.isIntLiteral(token)) {
            token = reader.read();
            node = new SimpleASTNode(ASTNodeType.IntLiteral, token.getTokenText());
        } else if (TokenUtil.isLeftBracket(token)) {
            token = reader.read();
            node = additive(reader);

            if (Objects.nonNull(node)) {
                token = reader.peek();      //继续往下解析
                if (TokenUtil.isRightBracket(token)) {
                    token = reader.read();
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
     * @param reader    token stream
     * @return
     */
    public SimpleASTNode additive(TokenReader reader) throws MyParseException {

         /*
        SimpleASTNode child1 = multiplicative(reader);
        SimpleASTNode node = child1;
        Token token = reader.peek();
        if (isPlus(token) || isMinus(token)) {
            token = reader.read();      //消耗掉这个token
            SimpleASTNode child2 = additive(reader);
            if (Objects.nonNull(child2)) {
                node = new SimpleASTNode(ASTNodeType.AdditiveExpr, token.getTokenText());
                node.addChild(child1);
                node.addChild(child2);
            } else {
                String symbol = null;
                if (isPlus(token))
                    symbol = "+";
                else
                    symbol = "-";

                throw new MyParseException("Invalid expression, expect right part of the expression after '"+ symbol +"' here");
            }
        }*/

        // 上面采用的文法为   add := mul | mul + add, 存在结合性问题
        // 应修改为    add :=  mul (+ mul)*
        // 也即 add := mul | add'
        //     add' := + mul add' | ε (epsilon)
        // 采用非递归方式消除左递归带来的结合性问题
        SimpleASTNode child1 = multiplicative(reader);
        SimpleASTNode node = child1;
        if (Objects.nonNull(child1)) {
            while (true) {
                //循环运用 mul (+ mul)* 中的   (+ mul)*
                Token token = reader.peek();
                if (TokenUtil.isPlus(token) || TokenUtil.isMinus(token)) {
                    token = reader.read();
                    SimpleASTNode child2 = multiplicative(reader);
                    node = new SimpleASTNode(ASTNodeType.AdditiveExpr, token.getTokenText());
                    node.addChild(child1);      //新节点在顶层，以确保结合性
                    node.addChild(child2);
                    child1 = node;          // confused here
                } else {
                    break;
                }
            }
        }

        return node;
    }


    /**
     * 解析乘除法表达式
     * @param reader    token stream
     * @return
     */
    public SimpleASTNode multiplicative(TokenReader reader) throws MyParseException {
        SimpleASTNode child1 = primary(reader);
        //
        SimpleASTNode node = child1;
        Token token = reader.peek();
        if (Objects.nonNull(child1) && Objects.nonNull(token)) {
            if (TokenUtil.isMultiple(token) || TokenUtil.isDivide(token)) {
                token = reader.read();
                SimpleASTNode child2 = primary(reader);
                if (Objects.nonNull(child2)) {
                    node = new SimpleASTNode(ASTNodeType.MultiplicativeExpr, token.getTokenText());
                    node.addChild(child1);
                    node.addChild(child2);
                } else {
                    String symbol = null;
                    if (TokenUtil.isMultiple(token))
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
     * @param reader  token stream
     * @return
     */
    public SimpleASTNode intDeclaration(TokenReader reader) throws MyParseException {
        SimpleASTNode node = null;
        Token token = reader.peek();        //预读
        if (TokenUtil.isInt(token)) {
            token = reader.read();          //读出int
            if (TokenUtil.isIdentifier(reader.peek())) {    //接着读
                token = reader.read();      //读出标识符
                /*此处只建立表达式子节点*/
                node = new SimpleASTNode(ASTNodeType.IntDeclaration, token.getTokenText());
                if (TokenUtil.isAssignment(reader.peek())) {
                    token = reader.read();   //读出 =
                    SimpleASTNode child = additive(reader);   //此处期待一个表达式，并返回一个AST节点
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
                token = reader.peek();
                if (TokenUtil.isSemiColon(reader.peek())) {
                    token = reader.read();
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
    public int calculate(ASTNode node, String indent) {
        int result = 0;
        int res1 = 0, res2 = 0;
        System.out.println(indent + node.getType() + ":" + node.getText());
        switch(node.getType()) {
            case Program:
                for (ASTNode child : node.children()) {
                    result = calculate(child, indent + "\t");
                }
                break;
            case AdditiveExpr:
                res1 = calculate(node.children().get(0), indent + "\t");
                res2 = calculate(node.children().get(1), indent + "\t");
                if ("+".equals(node.getText())) {
                    result = res1 + res2;
                } else {
                    result = res1 - res2;
                }
                break;
            case MultiplicativeExpr:
                res1 = calculate(node.children().get(0), indent + "\t");
                res2 = calculate(node.children().get(1), indent + "\t");
                if ("*".equals(node.getText())) {
                    result = res1 * res2;
                } else {
                    result = res1 / res2;
                }
                break;
            case IntLiteral:
                result = Integer.valueOf(node.getText());
                break;
            default:
                break;
        }
        System.out.println(indent + "Result: " + result);
        return  result;
    }


    public void dumpText(ASTNode node, String indent) {
        System.out.println(indent + node.getType() + ":" + node.getText());
        for (ASTNode child : node.children()) {
            dumpText(child, indent + "\t");
        }
    }

}
