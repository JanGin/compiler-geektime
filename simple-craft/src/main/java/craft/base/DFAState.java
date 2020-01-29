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
    DBPLUS,     // ++
    DBMINUS,    // --
    PLUSEQ,     // +=
    MINUSEQ,    // -=
    SIMICOLON,  // ;
    Int,        // int
    Int_i, Int_n,
    Float,      // float
    Double,     // double
    Char,       // char
    IntLiteral  //int

    //private String token;

    /*
    DFAState(String token) {
        this.token = token;
    }
    */

}
