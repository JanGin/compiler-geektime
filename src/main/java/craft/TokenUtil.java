package craft;

public class TokenUtil {

    public static boolean isAlpha(char ch) {
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
    }

    public static boolean isDigit(char ch) {
        return ch >= '0' && ch <= '9';
    }

    public static boolean isBlank(char ch) { return ch == ' ' || ch == '\t' || ch == '\r' || ch == '\n'; }
}
