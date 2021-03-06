package craft.base;

public enum ASTNodeType {

    Program,
    IntDeclaration,     // int 声明语句
    ExpressionStmt,     // 表达式语句
    AssignmentStmt,     // 赋值语句


    PrimaryStmt,        // 基础表达式
    AdditiveExpr,           // 加法表达式
    MultiplicativeExpr,     // 乘法表达式

    Identifier,         // 标识符，关键字
    IntLiteral,          // 整型字面量
    LeftBracket,        // 左括号 (
    RightBracket        //右括号  )
}
