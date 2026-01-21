# Phase 3: Abstract Syntax Tree (AST) Construction

## Overview

Phase 3 of the SQL Compiler project implements the **Abstract Syntax Tree (AST)** construction. The AST is a hierarchical tree representation of the SQL source code that captures the essential structure and meaning of the code while abstracting away syntactic details like parentheses, semicolons, and keywords.

## What is an AST?

An **Abstract Syntax Tree** is a tree representation of the abstract syntactic structure of source code. Each node in the tree represents a construct in the source code:

```
SQL Query: SELECT name, age FROM users WHERE active = 1;

AST Representation:
+-- SELECT
    |-- SelectItem: name
    |-- SelectItem: age
    |-- FROM
    |   +-- Table: users
    +-- WHERE
        +-- BinaryExpr: EQUALS
            |-- Identifier: active
            +-- Literal: 1
```

### Why do we need an AST?

1. **Simplifies Analysis**: The AST removes unnecessary syntactic details, making it easier to analyze the code
2. **Enables Semantic Analysis**: Phase 4 uses the AST to check for semantic errors (type checking, scope resolution)
3. **Facilitates Code Generation**: The AST provides a clean structure for generating target code
4. **Supports Optimization**: Tree transformations can optimize queries before execution

## Architecture

### Directory Structure

```
src/ast/
├── ASTNode.java           # Abstract base class for all AST nodes
├── ASTVisitor.java        # Visitor interface for traversing the AST
├── ASTBuilderVisitor.java # Converts parse tree to AST
├── ASTMain.java           # Main program to demonstrate AST
└── nodes/                 # AST node classes
    ├── SqlFile.java              # Root node containing all statements
    ├── SelectStatement.java      # SELECT query
    ├── InsertStatement.java      # INSERT statement
    ├── UpdateStatement.java      # UPDATE statement
    ├── DeleteStatement.java      # DELETE statement
    ├── CreateTableStatement.java # CREATE TABLE
    ├── AlterTableStatement.java  # ALTER TABLE
    ├── DropTableStatement.java   # DROP TABLE
    ├── TruncateStatement.java    # TRUNCATE TABLE
    ├── UseStatement.java         # USE database
    ├── FromClause.java           # FROM clause
    ├── TableSource.java          # Table reference
    ├── WhereClause.java          # WHERE clause
    ├── JoinClause.java           # JOIN clause
    ├── GroupByClause.java        # GROUP BY clause
    ├── HavingClause.java         # HAVING clause
    ├── OrderByClause.java        # ORDER BY clause
    ├── OrderByItem.java          # Single ORDER BY item
    ├── Identifier.java           # Column/table name
    ├── Literal.java              # Constant value
    ├── BinaryExpression.java     # Binary operation (a + b, x = y)
    ├── UnaryExpression.java      # Unary operation (NOT, -)
    ├── FunctionCall.java         # Function call (COUNT, MAX)
    ├── CaseExpression.java       # CASE expression
    ├── WhenClause.java           # WHEN clause in CASE
    ├── SubqueryExpression.java   # Nested SELECT
    ├── SelectItem.java           # Item in SELECT list
    ├── ColumnDef.java            # Column definition
    ├── Assignment.java           # SET assignment
    └── TableConstraint.java      # Table constraint
```

### Design Patterns Used

1. **Composite Pattern**: ASTNode is the base class; all nodes can have children, creating a tree structure
2. **Visitor Pattern**: ASTVisitor interface allows operations on the tree without modifying node classes
3. **Builder Pattern**: ASTBuilderVisitor constructs the AST from the parse tree

## How It Works

### Step 1: Lexical Analysis (Phase 1)
The lexer tokenizes the SQL input into tokens (keywords, identifiers, operators, etc.)

### Step 2: Syntactic Analysis (Phase 2)
The parser builds a **parse tree** (also called CST - Concrete Syntax Tree) from tokens

### Step 3: AST Construction (Phase 3)
The `ASTBuilderVisitor` traverses the parse tree and builds a simplified AST:

```
Input SQL → Lexer → Tokens → Parser → Parse Tree → ASTBuilder → AST
```

### ASTBuilderVisitor

The `ASTBuilderVisitor` extends ANTLR's `mysqlparserBaseVisitor` and overrides visit methods for each grammar rule:

```java
@Override
public ASTNode visitSelectStatement(mysqlparser.SelectStatementContext ctx) {
    SelectStatement select = new SelectStatement();

    // Visit SELECT clause
    if (ctx.selectClause() != null) {
        // Process select items...
    }

    // Visit FROM clause
    if (ctx.fromClause() != null) {
        FromClause fromClause = (FromClause) visit(ctx.fromClause());
        select.setFromClause(fromClause);
    }

    // Visit WHERE clause
    if (ctx.whereClause() != null) {
        WhereClause whereClause = (WhereClause) visit(ctx.whereClause());
        select.setWhereClause(whereClause);
    }

    return select;
}
```

## How to Run

### Prerequisites
- Java JDK 8 or higher
- ANTLR 4.13.2 (located at `/usr/local/lib/antlr-4.13.2-complete.jar`)

### Running the AST Demo

From the project root directory:

```bash
# Run with a SQL file
./scripts/run_ast.sh tests/input/ast_test.sql

# Run with any SQL file
./scripts/run_ast.sh path/to/your/file.sql
```

### What the Script Does

1. **Generates Parser**: Runs ANTLR to generate lexer/parser with visitor support
2. **Compiles**: Compiles all Java files (parser + AST classes)
3. **Runs**: Executes the AST demo with the specified SQL file

### Example Output

```
============================================================
SQL Compiler - Phase 3: AST Construction
Input: tests/input/ast_test.sql
============================================================

Phase 1: Lexical Analysis (Tokenization)
----------------------------------------
Total tokens: 48

Phase 2: Syntactic Analysis (Parsing)
----------------------------------------
Parse successful - no syntax errors

Phase 3: AST Construction
----------------------------------------
AST built successfully

============================================================
ABSTRACT SYNTAX TREE
============================================================

+-- SqlFile (4 statements)
    |-- SELECT
    |   |-- SelectItem: Identifier: id
    |   |-- SelectItem: Identifier: name
    |   |-- FROM (1 tables)
    |   |   +-- Table: users
    |   +-- WHERE
    |       +-- BinaryExpr: EQUALS
    |           |-- Identifier: active
    |           +-- Literal: INTEGER = 1
    |-- INSERT INTO products (2 columns) VALUES (1 rows)
    |   |-- Identifier: products
    |   |-- Literal: STRING = 'Widget'
    |   +-- Literal: DECIMAL = 19.99
    ...
```

## Supported SQL Constructs

### Statements
| Statement | Description |
|-----------|-------------|
| SELECT | Query with columns, FROM, WHERE, JOIN, GROUP BY, HAVING, ORDER BY |
| INSERT | Insert with VALUES or SELECT |
| UPDATE | Update with SET and WHERE |
| DELETE | Delete with WHERE |
| CREATE TABLE | Create table with columns and constraints |
| ALTER TABLE | Modify table structure |
| DROP TABLE | Remove table |
| TRUNCATE | Empty table |
| USE | Switch database |

### Clauses
| Clause | Description |
|--------|-------------|
| FROM | Source tables |
| WHERE | Filter condition |
| JOIN | INNER, LEFT, RIGHT, FULL, CROSS joins |
| GROUP BY | Grouping columns |
| HAVING | Group filter |
| ORDER BY | Sort order with ASC/DESC |

### Expressions
| Expression | Example |
|------------|---------|
| Binary | `a + b`, `x = y`, `p AND q` |
| Unary | `NOT x`, `-5`, `EXISTS (...)` |
| Aggregate | `COUNT(*)`, `SUM(amount)`, `AVG(price)` |
| Function | `UPPER(name)`, `GETDATE()` |
| CASE | `CASE WHEN x THEN y ELSE z END` |
| Subquery | `(SELECT ...)` |
| Literal | `'text'`, `123`, `45.67`, `NULL` |
| Identifier | `column`, `table.column` |

## AST Node Classes

### Base Class: ASTNode

```java
public abstract class ASTNode {
    protected List<ASTNode> children = new ArrayList<>();
    protected String nodeName;

    public void addChild(ASTNode child);
    public List<ASTNode> getChildren();
    public void print();  // Display tree structure
    public abstract void accept(ASTVisitor visitor);
}
```

### Example Node: SelectStatement

```java
public class SelectStatement extends ASTNode {
    private boolean distinct = false;
    private Integer topCount;
    private List<ASTNode> selectItems = new ArrayList<>();
    private FromClause fromClause;
    private List<JoinClause> joinClauses = new ArrayList<>();
    private WhereClause whereClause;
    private GroupByClause groupByClause;
    private HavingClause havingClause;
    private OrderByClause orderByClause;

    // Getters and setters...
}
```

## Comparison: Parse Tree vs AST

| Parse Tree (CST) | Abstract Syntax Tree (AST) |
|------------------|---------------------------|
| Contains all tokens | Contains only essential elements |
| Includes punctuation | Omits semicolons, parentheses |
| Deep nesting | Flattened structure |
| Grammar-dependent | Semantically meaningful |
| Used for parsing | Used for analysis & execution |

### Example

**SQL**: `SELECT * FROM users;`

**Parse Tree**:
```
sqlFile
└── statement
    └── dmlStatement
        └── selectStatement
            ├── selectClause
            │   ├── SELECT
            │   └── selectList
            │       └── STAR
            └── fromClause
                ├── FROM
                └── tableSource
                    └── tableName
                        └── identifier
                            └── IDENTIFIER: users
```

**AST**:
```
SqlFile
└── SELECT
    ├── SelectItem: *
    └── FROM
        └── Table: users
```

## Testing

### Test Files

```bash
# Simple test
./scripts/run_ast.sh tests/input/ast_test.sql

# Complex test with JOINs, subqueries, aggregates
./scripts/run_ast.sh tests/input/train1.sql

# CREATE TABLE with constraints
./scripts/run_ast.sh tests/input/train2.sql
```

### Creating Your Own Test

Create a SQL file and run:

```bash
echo "SELECT id, name FROM users WHERE active = 1;" > test.sql
./scripts/run_ast.sh test.sql
```

## Next Steps: Phase 4

The AST created in Phase 3 will be used in **Phase 4 (Semantic Analysis)** to:

1. **Type Checking**: Verify that operations are valid for the data types
2. **Scope Resolution**: Ensure columns and tables exist
3. **Name Resolution**: Resolve aliases and qualified names
4. **Constraint Validation**: Check that constraints are satisfied

## Summary

Phase 3 successfully implements AST construction by:

1. Defining a hierarchy of AST node classes using the Composite pattern
2. Implementing ASTBuilderVisitor to convert parse trees to ASTs
3. Supporting all major SQL constructs (SELECT, INSERT, UPDATE, DELETE, CREATE, etc.)
4. Providing a visual tree representation for debugging and verification

The AST provides a clean, simplified representation of SQL code that serves as the foundation for semantic analysis and code generation in subsequent compiler phases.
