package ast;

import java.util.ArrayList;
import java.util.List;

/**
 * Abstract base class for all AST nodes.
 * Implements the Composite Design Pattern.
 */
public abstract class ASTNode {

    // Child nodes
    protected List<ASTNode> children = new ArrayList<>();

    // Node name (for display purposes)
    protected String nodeName;

    /**
     * Constructor
     */
    public ASTNode() {
        this.nodeName = this.getClass().getSimpleName();
    }

    /**
     * Add a child node
     */
    public void addChild(ASTNode child) {
        if (child != null) {
            children.add(child);
        }
    }

    /**
     * Add multiple children
     */
    public void addChildren(List<? extends ASTNode> nodes) {
        if (nodes != null) {
            for (ASTNode node : nodes) {
                addChild(node);
            }
        }
    }

    /**
     * Get all children
     */
    public List<ASTNode> getChildren() {
        return children;
    }

    /**
     * Check if this node has children
     */
    public boolean hasChildren() {
        return !children.isEmpty();
    }

    /**
     * Get node name
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * Print the AST tree structure
     */
    public void print() {
        print("", true);
    }

    /**
     * Print with indentation
     */
    protected void print(String prefix, boolean isLast) {
        // Print current node
        System.out.println(prefix + (isLast ? "+-- " : "|-- ") + toString());

        // Print children
        String childPrefix = prefix + (isLast ? "    " : "|   ");
        for (int i = 0; i < children.size(); i++) {
            children.get(i).print(childPrefix, i == children.size() - 1);
        }
    }

    /**
     * Get string representation of this node
     * Subclasses should override this to provide meaningful output
     */
    @Override
    public String toString() {
        return nodeName;
    }

    /**
     * Accept a visitor (for future extensions)
     */
    public abstract void accept(ASTVisitor visitor);
}
