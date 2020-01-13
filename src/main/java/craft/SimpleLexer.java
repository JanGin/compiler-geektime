package craft;

import java.util.ArrayList;
import java.util.List;

import static craft.TokenUtil.*;

public class SimpleLexer {

    private Token token =  null;
    private List<Token> tokens = null;
    private StringBuffer tokenText = null;

    public static void main(String[] args) {

        SimpleLexer lexer = new SimpleLexer();
        String script1 = "age == 45";

        List<Token> tokens1 = lexer.tokenize(script1);
        dumpText(tokens1);

        //String script2 = "age = 45";

        //List<Token> tokens2 = lexer.tokenize(script2);
        //dumpText(tokens2);

    }


    //文本解析成token列表
    public List<Token> tokenize(String text) {
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
                    if (isDigit(ch) || isAlpha(ch)) {
                        tokenText.append(ch);
                        break;
                    } else {
                        //重新确定状态
                        state = initToken(ch);
                        break;
                    }
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
                case GE:
                case LE:
                case EQ:
                    state = initToken(ch);
                    break;
                case NumLiteral:
                    if (isDigit(ch)) {
                        tokenText.append(ch);
                    } else {
                        state = initToken(ch);
                    }
                    break;
                default:
                    break;
            }
        }

        if (tokenText.length() > 0) {
            initToken('0');
        }

        return tokens;
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
            state = DFAState.Id;
            token.setTokenType(TokenType.Identifier);
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
        }

        //保存当前值
        tokenText.append(ch);
        return state;

    }

    public static void dumpText(List<Token> list) {
        System.out.println("[text]\t[type]");
        if (list != null && list.size() > 0) {
            for (Token token : list) {
                System.out.println(token.getTokenText()+"\t\t"+token.getTokenType());
            }
        }
    }
}
