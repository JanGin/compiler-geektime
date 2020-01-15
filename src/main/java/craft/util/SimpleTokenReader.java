package craft.util;

import craft.base.Token;

import java.util.List;

public class SimpleTokenReader implements TokenReader {


    private int position;

    private List<Token> tokens;

    public SimpleTokenReader(List<Token> tokens) {
        this.position = 0;
        this.tokens = tokens;
    }

    @Override
    public Token read() {
        if (position < tokens.size())
            return tokens.get(position++);

        return null;
    }

    @Override
    public Token peek() {
        if (position < tokens.size())
            return tokens.get(position);

        return null;
    }

    @Override
    public void unread() {
        if (position > 0)
            --position;
    }

    @Override
    public void setPosition(int position) {
        if (position < tokens.size() && position >= 0) {
            this.position = position;
        }
    }

    @Override
    public int getPosition() {
        return this.position;
    }
}
