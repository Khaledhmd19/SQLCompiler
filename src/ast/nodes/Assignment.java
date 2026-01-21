package ast.nodes;

import ast.ASTNode;
import ast.ASTVisitor;

/**
 * AST node for an assignment (column = value) in UPDATE statement.
 */
public class Assignment extends ASTNode {

    private Identifier column;
    private ASTNode value;

    public Assignment() {
        super();
    }

    public Assignment(Identifier column, ASTNode value) {
        super();
        setColumn(column);
        setValue(value);
    }

    public void setColumn(Identifier column) {
        this.column = column;
        addChild(column);
    }

    public Identifier getColumn() {
        return column;
    }

    public void setValue(ASTNode value) {
        this.value = value;
        addChild(value);
    }

    public ASTNode getValue() {
        return value;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        String colName = column != null ? column.getName() : "?";
        return "Assignment: " + colName + " = ...";
    }
}
