package craft.base;

public enum DFAState {

    //Initial(""),
    //GT(">"),
    //LT("<"),
    //EQ("="),
    //GE(">="),
    //LE("<=");

    //DFA的初始状态
    Initial,
    Id,         //标识符
    GT,         // >
    GE,         // >=
    LT,         // <
    LE,         // <=
    EQ,         // ==
    Assignment, // =
    IF,         // if
    ELSE,       // else
    LF_BRACKET, // (
    RH_BRACKET, // )
    PLUS,       // +
    MINUS,      // -
    MULTIPLE,   // *
    DIVIDE,     // /
    LF_BRACE,
    RH_BRACE,
    PLUSEQ,     // +=
    MINUSEQ,    // -=
    SIMICOLON,  // ;
    Int,        // int
    Int_i, Int_n, Int_t,
    Float,      // float
    Double,     // double
    Char,       // char
    NumLiteral  //numberic

    //private String token;

    /*
    craft.base.DFAState(String token) {
        this.token = token;
    }
    */

}