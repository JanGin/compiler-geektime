package craft.base;

public enum ASTNodeType {

    Program,
    IntDeclaration,     // int 声明语句
    ExpressionStmt,     // 表达式语句
    AssignmentStmt,     // 赋值语句


    PrimaryStmt,        // 基础表达式
    Additive,           // 加法表达式
    Multiplicative,     // 乘法表达式

    Identifier,         // 标识符，关键字
    NumLiteral          // 数字型字面量
}
