package craft.util;

import craft.base.Token;

/**
 *
 */
public interface TokenReader {

    /**
     * retrieve a token from token stream
     * @return
     */
    Token read();

    /**
     * read a token from token stream
     * @return
     */
    Token peek();

    /**
     * backtrack a token position
     * @return
     */
    void unread();

    /**
     * relocate the token position in token stream
     */
    void setPosition(int position);

    /**
     * get the current position of token stream
     * @return
     */
    int getPosition();
}
