package craft.base;

public interface Token {

    TokenType getTokenType();

    String getTokenText();

    void setTokenText(String tokenText);

    void setTokenType(TokenType tokenType);
}
