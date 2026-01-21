package ast.nodes;

import ast.ASTNode;
import ast.ASTVisitor;

/**
 * AST node for an alias (e.g., AS baz).
 */
public class Alias extends ASTNode {

    private String name;

    public Alias(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        // Alias is a leaf node
    }

    @Override
    public String toString() {
        return "Alias: " + name;
    }
}
