# SQL Compiler Project - Phase Three

## University Information
- **University:** Damascus University - Faculty of Informatics Engineering
- **Year:** Fourth Year
- **Department:** Artificial Intelligence
- **Course:** Practical Compilers

---

## Phase Three: Abstract Syntax Tree (AST) Construction, Printing, and Display

### Overview

An **Abstract Syntax Tree (AST)** is a data structure used to represent the structure of a program (input). This abstract intermediate representation does not include all the details that appear during syntactic parsing (parse tree). 

**Abstract symbols that do NOT appear in the AST include:**
- Punctuation marks (semicolons, colons, etc.)
- Parentheses `(` `)` 
- Square brackets `[ ]`
- Angle brackets `< >`
- And other similar symbols

### Objective

The goal of this phase is to:
1. Build the parse tree for the program after verifying input correctness at the syntactic level
2. Construct the abstract syntax tree based on the grammar rules
3. Print the tree
4. Display it

---

## Steps for Building the Abstract Syntax Tree

We will use **Object-Oriented** concepts and **design patterns** to build the tree. Specifically, we will rely on the **Composite Design Pattern** (class diagrams and relationships are provided in the lecture slides on tree construction).

### Step 1: Define the AST Model Package

Define a package that will contain the definition of the AST Model:

#### 1.1 Separate Class for Each Non-Terminal Symbol
- Create a separate class for each **non-terminal** symbol in the grammar rules
- Tree nodes will be objects instantiated from these defined classes
- Each class inherits from the abstract parent class `ASTNode`

#### 1.2 Separate Class for Each Terminal Symbol
- Create a separate class for each **terminal** symbol in the grammar rules
- Only if this terminal symbol carries information (i.e., has variable values)
- Tree nodes will be objects instantiated from these defined classes
- Each class inherits from the abstract parent class `ASTNode`

#### 1.3 Abstract Parent Class: ASTNode
- Each defined class inherits from the abstract base class `ASTNode`
- This class contains:
  - A set of data members
  - A set of common methods
  - These methods will be implemented in child classes (terminal and non-terminal symbol classes)
  - **Includes the print method** for tree printing

#### 1.4 Define the ASTBuilderVisitor Class
- Create the `ASTBuilderVisitor` class
- This class leverages the `BaseVisitor` class provided by ANTLR 4
- It will be used to visit the parse tree and build the AST during traversal

### Step 2: Define the Main Package

Define a package containing a single class with the `main` method:

This class will:
1. Read the input string
2. Generate tokens
3. Build the parse tree
4. Use the `ASTBuilderVisitor` class to visit the parse tree
5. Generate the AST
6. Print the AST

---

## Example Query

```sql
--
-- This is an example query
--
SELECT
foo, bar as baz
FROM
mytable
WHERE
foo LIKE '%neat%'
ORDER BY
foo DESC
```

---

## Architecture Overview

```
Input SQL Code
    ↓
Lexical Analyzer (Phase 1)
    ↓ (Tokens)
Syntax Parser (Phase 2)
    ↓ (Parse Tree)
AST Builder Visitor
    ↓
Abstract Syntax Tree (AST)
    ↓
Print/Display AST
```

---

## Implementation Notes

### Class Hierarchy

```
ASTNode (abstract)
├── SelectStatement
├── UpdateStatement
├── DeleteStatement
├── InsertStatement
├── FromClause
├── WhereClause
├── OrderByClause
├── Expression
├── Identifier
├── Literal
└── ... (other statement and expression classes)
```

### Visitor Pattern

The `ASTBuilderVisitor` implements the visitor pattern to traverse the parse tree:

- **Visit methods** for each grammar rule
- Each visit method creates corresponding AST node objects
- Builds the tree structure bottom-up during traversal

### Tree Printing

The `print()` method in each `ASTNode` class:
- Prints the node's information
- Recursively prints all child nodes
- Formats output for readability

---
