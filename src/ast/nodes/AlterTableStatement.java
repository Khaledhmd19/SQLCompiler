package ast.nodes;

import ast.ASTNode;
import ast.ASTVisitor;
import java.util.List;
import java.util.ArrayList;

/**
 * AST node for ALTER TABLE statement.
 */
public class AlterTableStatement extends ASTNode {

    private Identifier tableName;
    private List<ASTNode> alterActions = new ArrayList<>();

    public AlterTableStatement() {
        super();
    }

    public void setTableName(Identifier tableName) {
        this.tableName = tableName;
        addChild(tableName);
    }

    public Identifier getTableName() {
        return tableName;
    }

    public void addAlterAction(ASTNode action) {
        alterActions.add(action);
        addChild(action);
    }

    public List<ASTNode> getAlterActions() {
        return alterActions;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ALTER TABLE ");
        if (tableName != null) {
            sb.append(tableName.getName());
        }
        return sb.toString();
    }
}
