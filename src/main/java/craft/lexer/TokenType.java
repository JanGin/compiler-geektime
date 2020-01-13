package craft.lexer;

public enum TokenType {


    Identifier,     //标识符，关键字
    NumLiteral,     //数字型字面量
    StrLiteral,     //字符串型字面量
    GT,             // >
    LT,             // <
    EQ,             // ==
    GE,             // >=
    LE,             // <=
    Assignment,     // =
    PLUS,           // +
    MINUS,          // -
    MULTIPLE,       // *
    DIVIDE,         // /
    SEMICOLON,      // ;
    LF_BRACKET,     // (
    RH_BRACKET,     // )
    IF,             // if
    ELSE,           // else
    Int,            // int
    Int_i,          //
    Int_n,          //
    Int_t,
    Char,           // char
    Float,          // float
    Double          // double
}
