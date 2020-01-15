package craft.util;

import craft.base.Token;
import craft.base.TokenType;

import java.util.Objects;

public class TokenUtil {

    public static boolean isAlpha(char ch) {
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
    }

    public static boolean isDigit(char ch) {
        return ch >= '0' && ch <= '9';
    }

    public static boolean isBlank(char ch) {
        return ch == ' ' || ch == '\t' || ch == '\r' || ch == '\n';
    }

    public static boolean isInt(Token token) {
        return Objects.nonNull(token) && TokenType.Int.equals(token.getTokenType());
    }

    public static boolean isIdentifier(Token token) {
        return Objects.nonNull(token) && TokenType.Identifier.equals(token.getTokenType());
    }

    public static boolean isAssignment(Token token) {
        return Objects.nonNull(token) && TokenType.Assignment.equals(token.getTokenType());
    }

    public static boolean isSemiColon(Token token) {
        return Objects.nonNull(token) && TokenType.SemiColon.equals(token.getTokenType());
    }

    public static boolean isIntLiteral(Token token) {
        return Objects.nonNull(token) && TokenType.IntLiteral.equals(token.getTokenType());
    }

    public static boolean isLeftBracket(Token token) {
        return Objects.nonNull(token) && TokenType.LF_BRACKET.equals(token.getTokenType());
    }

    public static boolean isRightBracket(Token token) {
        return Objects.nonNull(token) && TokenType.RH_BRACKET.equals(token.getTokenType());
    }

    public static boolean isMultiple(Token token) {
        return Objects.nonNull(token) && TokenType.MULTIPLE.equals(token.getTokenType());
    }

    public static boolean isDivide(Token token) {
        return Objects.nonNull(token) && TokenType.DIVIDE.equals(token.getTokenType());
    }

    public static boolean isAdditive(Token token) {
        return Objects.nonNull(token) && TokenType.PLUS.equals(token.getTokenType());
    }

    public static boolean isMinus(Token token) {
        return Objects.nonNull(token) && TokenType.MINUS.equals(token.getTokenType());
    }
}
