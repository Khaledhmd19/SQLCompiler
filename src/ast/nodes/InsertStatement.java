package ast.nodes;

import ast.ASTNode;
import ast.ASTVisitor;
import java.util.List;
import java.util.ArrayList;

/**
 * AST node for INSERT statement.
 */
public class InsertStatement extends ASTNode {

    private Identifier tableName;
    private List<Identifier> columns = new ArrayList<>();
    private List<List<ASTNode>> valueRows = new ArrayList<>();
    private SelectStatement selectStatement;  // For INSERT ... SELECT

    public InsertStatement() {
        super();
    }

    public void setTableName(Identifier tableName) {
        this.tableName = tableName;
        addChild(tableName);
    }

    public Identifier getTableName() {
        return tableName;
    }

    public void addColumn(Identifier column) {
        columns.add(column);
    }

    public List<Identifier> getColumns() {
        return columns;
    }

    public void addValueRow(List<ASTNode> values) {
        valueRows.add(values);
        for (ASTNode value : values) {
            addChild(value);
        }
    }

    public List<List<ASTNode>> getValueRows() {
        return valueRows;
    }

    public void setSelectStatement(SelectStatement selectStatement) {
        this.selectStatement = selectStatement;
        addChild(selectStatement);
    }

    public SelectStatement getSelectStatement() {
        return selectStatement;
    }

    public boolean isInsertSelect() {
        return selectStatement != null;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("INSERT INTO ");
        if (tableName != null) {
            sb.append(tableName.getName());
        }
        if (!columns.isEmpty()) {
            sb.append(" (").append(columns.size()).append(" columns)");
        }
        if (isInsertSelect()) {
            sb.append(" SELECT...");
        } else {
            sb.append(" VALUES (").append(valueRows.size()).append(" rows)");
        }
        return sb.toString();
    }
}
