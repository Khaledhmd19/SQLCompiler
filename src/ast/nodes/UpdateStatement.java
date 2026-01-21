package ast.nodes;

import ast.ASTNode;
import ast.ASTVisitor;
import java.util.List;
import java.util.ArrayList;

/**
 * AST node for UPDATE statement.
 */
public class UpdateStatement extends ASTNode {

    private Identifier tableName;
    private List<Assignment> assignments = new ArrayList<>();
    private WhereClause whereClause;

    public UpdateStatement() {
        super();
    }

    public void setTableName(Identifier tableName) {
        this.tableName = tableName;
        addChild(tableName);
    }

    public Identifier getTableName() {
        return tableName;
    }

    public void addAssignment(Assignment assignment) {
        assignments.add(assignment);
        addChild(assignment);
    }

    public List<Assignment> getAssignments() {
        return assignments;
    }

    public void setWhereClause(WhereClause whereClause) {
        this.whereClause = whereClause;
        addChild(whereClause);
    }

    public WhereClause getWhereClause() {
        return whereClause;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UPDATE ");
        if (tableName != null) {
            sb.append(tableName.getName());
        }
        sb.append(" SET (").append(assignments.size()).append(" assignments)");
        return sb.toString();
    }
}
