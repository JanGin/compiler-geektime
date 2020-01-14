package craft.base;

import java.util.List;

public interface ASTNode {

    String getText();

    ASTNodeType getType();

    ASTNode parent();

    List<ASTNode> children();

}
