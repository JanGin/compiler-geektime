package craft.util;

import craft.base.ASTNode;
import craft.base.ASTNodeType;

import java.util.Objects;

public class ASTNodeUtil {

    public static boolean isProgram(ASTNode node) {
        return Objects.nonNull(node) && ASTNodeType.Program.equals(node.getType());
    }

    public static boolean isAssignmentStmt(ASTNode node) {
        return Objects.nonNull(node) && ASTNodeType.AssignmentStmt.equals(node.getType());
    }

    public static boolean isIntDeclarationStmt(ASTNode node) {
        return Objects.nonNull(node) && ASTNodeType.IntDeclaration.equals(node.getType());
    }

    public static boolean isIdentifier(ASTNode node) {
        return Objects.nonNull(node) && ASTNodeType.Identifier.equals(node.getType());
    }
}
