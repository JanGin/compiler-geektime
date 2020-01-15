package craft.calculator;

import craft.base.ASTNode;
import craft.base.ASTNodeType;
import craft.base.SimpleASTNode;
import craft.base.Token;
import craft.exception.MyParseException;
import craft.util.TokenReader;

import java.util.Objects;

import static craft.util.TokenUtil.*;

public class SimpleCalculator {


    /**
     * 解析基础表达式
     * @param reader
     * @return
     * @throws MyParseException
     */
    public SimpleASTNode primary(TokenReader reader) throws MyParseException {
        SimpleASTNode node = null;
        Token token = reader.peek();
        if (isIdentifier(token)) {
            node = new SimpleASTNode(ASTNodeType.Identifier, token.getTokenText());
        } else if (isIntLiteral(token)) {
            node = new SimpleASTNode(ASTNodeType.IntLiteral, token.getTokenText());
        } else if (isLeftBracket(token)) {
            token = reader.read();
            node = additive(reader);

            if (Objects.nonNull(node)) {
                token = reader.peek();      //继续往下解析
                if (isRightBracket(token)) {
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
     * @param reader
     * @return
     */
    public SimpleASTNode additive(TokenReader reader) throws MyParseException {
        SimpleASTNode child1 = multiplicative(reader);
        SimpleASTNode node = child1;
        Token token = reader.peek();
        if (isAdditive(token) || isMinus(token)) {
            token = reader.read();
            SimpleASTNode child2 = additive(reader);
            if (Objects.nonNull(child2)) {
                node = new SimpleASTNode(ASTNodeType.Additive, token.getTokenText());
                node.addChild(child1);
                node.addChild(child2);
            } else {
                throw new MyParseException("Invalid expression, expect right part of the expression here");
            }
        }
        return node;
    }


    /**
     * 解析乘除法表达式
     * @param reader
     * @return
     */
    public SimpleASTNode multiplicative(TokenReader reader) throws MyParseException {
        SimpleASTNode child1 = primary(reader);
        //
        SimpleASTNode node = child1;
        Token token = reader.peek();
        if (isMultiple(token) || isDivide(token)) {
            token = reader.read();
            SimpleASTNode child2 = primary(reader);
            if (Objects.nonNull(child2)) {
                node = new SimpleASTNode(ASTNodeType.Multiplicative, token.getTokenText());
                node.addChild(child1);
                node.addChild(child2);
            } else {
                throw new MyParseException("Invalid expression, expect right part of the expression here");
            }
        }
        return node;
    }

    /**
     * 整形表达式
     * @param reader
     * @return
     */
    public SimpleASTNode intDeclaration(TokenReader reader) throws MyParseException {
        SimpleASTNode node = null;
        Token token = reader.peek();        //预读
        if (isInt(token)) {
            token = reader.read();          //读出int
            if (isIdentifier(reader.peek())) {    //接着读
                token = reader.read();      //读出标识符
                /*此处只建立表达式子节点*/
                node = new SimpleASTNode(ASTNodeType.IntDeclaration, token.getTokenText());
                if (isAssignment(reader.peek())) {
                    token = reader.read();   //读出 =
                    SimpleASTNode child = additive(reader);   //此处期待一个表达式，并返回一个AST节点
                    if (Objects.nonNull(child)) {
                        node.addChild(child);
                    } else {
                        throw new MyParseException("Invalid variable initialization, expression Statement is expected");
                    }
                }
            } else {
                throw new MyParseException("Invalid int statement declaration, variable name is expected");
            }

            if (Objects.nonNull(node)) {
                // 读取 ;
                token = reader.peek();
                if (isSemiColon(reader.peek())) {
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
    public int calculate(ASTNode node, String text) {
        int result = 0;
        int res1 = 0, res2 = 0;
        System.out.printf("%s calculating: %s", text, node.getType());
        switch(node.getType()) {
            case Program:
                for (ASTNode child : node.children()) {
                    result = calculate(child, text + "\t");
                }
                break;
            case Additive:
                res1 = calculate(node.children().get(0), text + "\t");
                res2 = calculate(node.children().get(1), text + "\t");
                if ("+".equals(node.getText())) {
                    result = res1 + res2;
                } else {
                    result = res1 - res2;
                }
                break;
            case Multiplicative:
                res1 = calculate(node.children().get(0), text + "\t");
                res2 = calculate(node.children().get(1), text + "\t");
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
        System.out.println(text + "Result: " + result);
        return  result;
    }

    public static void main(String[] args) {

    }

}
