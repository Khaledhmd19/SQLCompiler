package ast.nodes;

import ast.ASTNode;
import ast.ASTVisitor;
import java.util.List;
import java.util.ArrayList;

/**
 * AST node for FROM clause.
 */
public class FromClause extends ASTNode {

    private List<TableSource> tables = new ArrayList<>();

    public FromClause() {
        super();
    }

    public void addTable(TableSource table) {
        tables.add(table);
        addChild(table);
    }

    public List<TableSource> getTables() {
        return tables;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "FROM";
    }
}
