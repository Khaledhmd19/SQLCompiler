package ast.nodes;

import ast.ASTNode;
import ast.ASTVisitor;
import java.util.List;

/**
 * Root node representing the entire SQL file.
 * Contains a list of statements.
 */
public class SqlFile extends ASTNode {

    public SqlFile() {
        super();
    }

    public SqlFile(List<ASTNode> statements) {
        super();
        addChildren(statements);
    }

    public void addStatement(ASTNode statement) {
        addChild(statement);
    }

    public List<ASTNode> getStatements() {
        return children;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "SqlFile (" + children.size() + " statements)";
    }
}
