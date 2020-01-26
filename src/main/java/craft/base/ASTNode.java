package craft.base;

import java.util.List;

public interface ASTNode {

    String getText();

    ASTNodeType getType();

    ASTNode parent();

    List<ASTNode> children();

    /*
    default boolean isNotEmpty(Collection<ASTNode> coll) {
        return coll != null && coll.size() > 0;
    }*/

}
