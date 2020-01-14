package craft.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SimpleASTNode implements ASTNode {

    private ASTNode parent;

    private List<ASTNode> children;

    private ASTNodeType type;

    private String text;

    private List<ASTNode> readOnlyChildren;


    public SimpleASTNode(ASTNodeType type, String text) {
        this.type = type;
        this.text = text;
        this.children = new ArrayList<>();
        this.readOnlyChildren = Collections.unmodifiableList(children);
    }

    public void addChild(SimpleASTNode node) {
        this.children.add(node);
        node.parent = this;
    }

    @Override
    public String getText() {
        return this.text;
    }

    @Override
    public ASTNodeType getType() {
        return this.type;
    }

    @Override
    public ASTNode parent() {
        return this.parent;
    }

    @Override
    public List<ASTNode> children() {
        return this.readOnlyChildren;
    }
}
