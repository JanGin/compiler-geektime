package craft.repl;

import craft.base.SimpleASTNode;
import craft.base.Token;
import craft.base.TokenType;
import craft.util.TokenReader;

import java.util.HashMap;
import java.util.Map;

public class SimpleREPL {

    private Map<String, Integer> variableTable = new HashMap<>();


    public static void main(String[] args) {

    }


    public SimpleASTNode assignmentExpr(TokenReader reader) {

        SimpleASTNode node = null;
        Token token = reader.peek();
        if (TokenType.Assignment.equals(token.getTokenType())) {
            token = reader.read();      //读过 '='

            //SimpleASTNode child1 =
        }
        return null;
    }

}
