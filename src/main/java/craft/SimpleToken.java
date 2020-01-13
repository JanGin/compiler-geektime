package craft;

public class SimpleToken implements Token {

    private TokenType tokenType = null;

    private String tokenText = null;

    @Override
    public TokenType getTokenType() {
        return tokenType;
    }

    @Override
    public String getTokenText() {
        return tokenText;
    }

    @Override
    public void setTokenText(String tokenText) {
        this.tokenText = tokenText;
    }

    @Override
    public void setTokenType(TokenType tokenType) {
        this.tokenType = tokenType;
    }

    @Override
    public String toString() {
        return "SimpleToken{" +
                "tokenType=" + tokenType +
                ", tokenText='" + tokenText + '\'' +
                '}';
    }
}
