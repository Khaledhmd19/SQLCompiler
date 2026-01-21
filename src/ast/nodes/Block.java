package ast.nodes;

import ast.ASTNode;
import ast.ASTVisitor;
import java.util.ArrayList;
import java.util.List;

/**
 * AST node for a block of statements (BEGIN ... END).
 */
public class Block extends ASTNode {

    private List<ASTNode> statements = new ArrayList<>();

    public Block() {
        super();
    }

    public void addStatement(ASTNode statement) {
        if (statement != null) {
            statements.add(statement);
            addChild(statement);
        }
    }

    public List<ASTNode> getStatements() {
        return statements;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        // visitor.visit(this); // Visitor method to be added if ASTVisitor interface is
        // updated
    }

    @Override
    public String toString() {
        return "Block (" + statements.size() + " statements)";
    }
}
