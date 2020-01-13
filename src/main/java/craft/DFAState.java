package craft;

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
    Int,        // int
    Float,      // float
    Double,     // double
    Char,       // char
    NumLiteral; //numberic

    //private String token;

    /*
    craft.DFAState(String token) {
        this.token = token;
    }
    */

}
