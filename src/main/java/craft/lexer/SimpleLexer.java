package craft.lexer;

import craft.base.DFAState;
import craft.base.SimpleToken;
import craft.base.Token;
import craft.base.TokenType;
import craft.util.SimpleTokenReader;
import craft.util.TokenReader;
import craft.util.TokenUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static craft.util.TokenUtil.*;

public class SimpleLexer {

    private Token token =  null;
    private List<Token> tokens = null;
    private StringBuffer tokenText = null;

    public static void main(String[] args) {

        SimpleLexer lexer = new SimpleLexer();
        //String script1 = "age == 35";
        //String script2 = "age = 35;";
        //String script3 = "int age = 35";
        //String script4 = "int inG = 35";
        //String script5 = "if (age == 35)";
        String script6 = "if (age == 35) { int b = 1;}";

        //List<Token> tokens = lexer.tokenize(script6);
        TokenReader tokens = lexer.tokenize(script6);
        dumpText(tokens);



    }


    //文本解析成token列表
    //修改为返回TokenStream, 由TokenReader封装
    public TokenReader tokenize(String text) {
        //初始化工作
        token = new SimpleToken();
        tokens = new ArrayList<>();
        tokenText = new StringBuffer();
        char[] array = text.toCharArray();

        DFAState state = DFAState.Initial;
        for (char ch : array) {
            if (isBlank(ch))
                continue;

            switch (state) {
                case Initial:
                    state = initToken(ch);
                    break;
                case Id:
                    if (isAlpha(ch) || isDigit(ch)) {
                        if (ch == 'i') {
                            state = DFAState.Int_i;
                            token.setTokenType(TokenType.Int_i);
                            tokenText.append(ch);
                            break;
                        } else {
                            tokenText.append(ch);
                            break;
                        }
                    } else {
                        //重新确定状态
                        state = initToken(ch);
                    }
                    break;
                case Int_i:
                    if (ch == 'f') {
                        state = DFAState.IF;
                        token.setTokenType(TokenType.IF);
                        tokenText.append(ch);
                    } else if (ch == 'n') {
                        state = DFAState.Int_n;
                        token.setTokenType(TokenType.Int_n);
                        tokenText.append(ch);
                    } else if (!TokenUtil.isBlank(ch)) {
                        state = DFAState.Id;
                        token.setTokenType(TokenType.Identifier);
                        tokenText.append(ch);
                    } else {
                        state = initToken(ch);
                    }
                    break;
                case Int_n:
                    if (ch == 't') {
                        state = DFAState.Int_t;
                        token.setTokenType(TokenType.Int_t);
                        tokenText.append(ch);
                    } else if (!TokenUtil.isBlank(ch)) {
                        state = DFAState.Id;
                        token.setTokenType(TokenType.Identifier);
                        tokenText.append(ch);
                    } else {
                        state = initToken(ch);
                    }
                    break;
                case GT:
                    if (ch == '=') {
                        state = DFAState.GE;
                        token.setTokenType(TokenType.GE);
                        tokenText.append(ch);
                        break;
                    } else {
                        //退出当前状态
                        state = initToken(ch);
                        break;
                    }
                case LT:
                    if (ch == '=') {
                        state = DFAState.LE;
                        token.setTokenType(TokenType.LE);
                        tokenText.append(ch);
                        break;
                    } else {
                        state = initToken(ch);
                        break;
                    }
                case Assignment:
                    if (ch == '=') {
                        state = DFAState.EQ;
                        token.setTokenType(TokenType.EQ);
                        tokenText.append(ch);
                    } else {
                        state = initToken(ch);
                    }
                    break;
                case NumLiteral:
                    if (isDigit(ch)) {
                        tokenText.append(ch);
                    } else {
                        state = initToken(ch);
                    }
                    break;
                case GE:
                case LE:
                case EQ:
                case PLUS:
                case MINUS:
                case MULTIPLE:
                case DIVIDE:
                case SIMICOLON:
                case LF_BRACKET:
                case RH_BRACKET:
                case Int_t:
                case IF:
                case LF_BRACE:
                case RH_BRACE:
                    state = initToken(ch);
                    break;

                default:
                    break;
            }
        }

        if (tokenText.length() > 0) {
            initToken('0');
        }

        return new SimpleTokenReader(tokens);
    }

    //确定 token的初始状态, 并保存当前读到的token值
    public DFAState initToken(char ch) {

        if (tokenText.length() > 0) {
            //保存旧的token内容
            token.setTokenText(tokenText.toString());
            tokens.add(token);

            //新建token
            token = new SimpleToken();
            tokenText = new StringBuffer();
        }

        DFAState state = DFAState.Initial;

        if (isAlpha(ch)) {
            if (ch == 'i') {
                state = DFAState.Int_i;
                token.setTokenType(TokenType.Int_i);
            } else {
                state = DFAState.Id;
                token.setTokenType(TokenType.Identifier);
            }
        } else if (isDigit(ch)) {
            state = DFAState.NumLiteral;
            token.setTokenType(TokenType.NumLiteral);
        } else if (ch == '>') {
            state = DFAState.GT;
            token.setTokenType(TokenType.GT);
        } else if (ch == '<') {
            state = DFAState.LT;
            token.setTokenType(TokenType.LT);
        } else if (ch == '=') {
            state = DFAState.Assignment;
            token.setTokenType(TokenType.Assignment);
        } else if (ch == '+') {
            state = DFAState.PLUS;
            token.setTokenType(TokenType.PLUS);
        } else if (ch == '-') {
            state = DFAState.MINUS;
            token.setTokenType(TokenType.MINUS);
        } else if (ch == '*') {
            state = DFAState.MULTIPLE;
            token.setTokenType(TokenType.MULTIPLE);
        } else if (ch == '/') {
            state = DFAState.DIVIDE;
            token.setTokenType(TokenType.DIVIDE);
        } else if (ch == ';') {
            state = DFAState.SIMICOLON;
            token.setTokenType(TokenType.SemiColon);
        } else if (ch == '(') {
            state = DFAState.LF_BRACKET;
            token.setTokenType(TokenType.LF_BRACKET);
        } else if (ch == ')') {
            state = DFAState.RH_BRACKET;
            token.setTokenType(TokenType.RH_BRACKET);
        } else if (ch == '{') {
            state = DFAState.LF_BRACE;
            token.setTokenType(TokenType.LF_BRACE);
        } else if (ch == '}') {
            state = DFAState.RH_BRACE;
            token.setTokenType(TokenType.RH_BRACE);
        }

        //保存当前值
        tokenText.append(ch);
        return state;

    }

    @Deprecated
    public static void dumpText(List<Token> list) {
        System.out.println("[text]\t[type]");
        if (list != null && list.size() > 0) {
            for (Token token : list) {
                System.out.println(token.getTokenText()+"\t\t"+token.getTokenType());
            }
        }
    }

    public static void dumpText(TokenReader reader) {
        System.out.println("[text]\t[type]");
        Token token = null;
        while (Objects.nonNull(token = reader.read())) {
            System.out.println(token.getTokenText()+"\t\t"+token.getTokenType());
        }
    }
}
