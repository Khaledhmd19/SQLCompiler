package ast.nodes;

import ast.ASTNode;
import ast.ASTVisitor;
import java.util.List;
import java.util.ArrayList;

/**
 * AST node for a function call (including aggregate functions).
 */
public class FunctionCall extends ASTNode {

    private String functionName;
    private List<ASTNode> arguments = new ArrayList<>();
    private boolean distinct = false;
    private boolean allColumns = false;  // For COUNT(*)

    public FunctionCall() {
        super();
    }

    public FunctionCall(String functionName) {
        super();
        this.functionName = functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void addArgument(ASTNode argument) {
        arguments.add(argument);
        addChild(argument);
    }

    public List<ASTNode> getArguments() {
        return arguments;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public void setAllColumns(boolean allColumns) {
        this.allColumns = allColumns;
    }

    public boolean isAllColumns() {
        return allColumns;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Function: ");
        sb.append(functionName).append("(");
        if (allColumns) {
            sb.append("*");
        } else if (distinct) {
            sb.append("DISTINCT ");
        }
        sb.append(arguments.size()).append(" args)");
        return sb.toString();
    }
}
