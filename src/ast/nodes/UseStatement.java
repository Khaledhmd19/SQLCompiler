package ast.nodes;

import ast.ASTNode;
import ast.ASTVisitor;

/**
 * AST node for USE database statement.
 */
public class UseStatement extends ASTNode {

    private Identifier databaseName;

    public UseStatement() {
        super();
    }

    public void setDatabaseName(Identifier databaseName) {
        this.databaseName = databaseName;
        addChild(databaseName);
    }

    public Identifier getDatabaseName() {
        return databaseName;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "USE " + (databaseName != null ? databaseName.getName() : "");
    }
}
