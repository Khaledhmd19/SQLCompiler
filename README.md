# SQL Compiler Project

A complete Transact-SQL compiler built with ANTLR4 for Damascus University (AI Department, Year 4).

## Project Structure

```
Compiler/
├── src/                          # Source grammar files
│   ├── mysqllexer.g4             # Lexer grammar (Phase 1)
│   └── mysqlparser.g4            # Parser grammar (Phase 2)
│
├── gen/                          # Generated Java files (auto-generated)
│   ├── mysqllexer.java           # Lexical analyzer
│   ├── mysqlparser.java          # Parser
│   ├── mysqlparserListener.java  # Parse tree listener
│   └── mysqlparserVisitor.java   # Parse tree visitor (for AST)
│
├── tests/                        # Test programs and data
│   ├── TestAll.java              # Comprehensive feature test
│   ├── TestSimpleSQL.java        # Simple SQL test
│   ├── TestComplexInput.java     # Complex SQL test
│   ├── TestDemo.java             # Demo test
│   ├── TestDetailed.java         # Detailed token + tree analysis
│   ├── TestVisualTree.java       # Colored parse tree viewer
│   ├── TestLexer.java            # Lexer-only test
│   └── input/                    # SQL test input files
│       ├── parser_test_input.txt # Simple SQL examples
│       ├── phase1_test_input.txt # Complex SQL examples
│       ├── demo.sql              # Feature demonstration
│       └── simple_example.sql    # Basic SELECT
│
├── scripts/                      # Build and run scripts
│   ├── compile.sh                # Build everything
│   ├── run_tests.sh              # Run all tests
│   ├── test_detailed.sh          # Detailed analysis
│   ├── show_tree.sh              # Visual parse tree
│   └── test_and_save.sh          # Test and save output
│
├── docs/                         # Documentation
│   ├── HOW_TO_RUN.md             # Complete command reference
│   ├── QUICK_START.md            # 3-step quick start
│   ├── FIXES_SUMMARY.md          # Implementation notes
│   ├── VISUAL_TREE_GUIDE.md      # Parse tree guide
│   └── phase 2 .pdf              # Requirements document
│
└── the-project-task/             # Project requirements
    ├── sql_compiler_project.md   # Phase 1 (Lexer)
    ├── sql_compiler_phase2.md    # Phase 2 (Parser)
    └── sql_compiler_phase3.md    # Phase 3 (AST)
```

## Quick Start

```bash
# 1. Build the project
./scripts/compile.sh

# 2. Run all tests
./scripts/run_tests.sh

# 3. View parse tree for a SQL file
./scripts/show_tree.sh tests/input/demo.sql
```

## Manual Commands

### Generate and Compile
```bash
# Generate lexer and parser
cd src
java -jar /usr/local/lib/antlr-4.13.2-complete.jar mysqllexer.g4
java -jar /usr/local/lib/antlr-4.13.2-complete.jar mysqlparser.g4
mv *.java *.interp ../gen/
cd ..

# Compile
javac -cp "gen:/usr/local/lib/antlr-4.13.2-complete.jar" gen/*.java tests/Test*.java -d tests/
```

### Run Tests
```bash
CLASSPATH="tests:gen:/usr/local/lib/antlr-4.13.2-complete.jar"

# Simple test
java -cp "$CLASSPATH" TestSimpleSQL

# All features
java -cp "$CLASSPATH" TestAll

# Detailed analysis on any SQL file
java -cp "$CLASSPATH" TestDetailed tests/input/demo.sql
```

## Supported Features

### DML Statements
- SELECT, INSERT, UPDATE, DELETE, MERGE, TRUNCATE

### DDL Statements
- CREATE TABLE, ALTER TABLE, DROP TABLE, RENAME TABLE

### Identifiers
- Regular: `users`, `column_name`
- Bracketed: `[User ID]`, `[dbo].[Users]`
- Quoted: `"table name"`
- Qualified: `schema.table`, `db.schema.table`

### Data Types
- `INT`, `VARCHAR(100)`, `NVARCHAR(MAX)`, `DECIMAL(10,2)`, etc.

### Operators
- Comparison: `=`, `!=`, `<>`, `>`, `<`, `>=`, `<=`
- Arithmetic: `+`, `-`, `*`, `/`, `%`
- Compound: `+=`, `-=`, `*=`, `/=`
- Logical: `AND`, `OR`, `NOT`, `IN`, `BETWEEN`, `LIKE`, `EXISTS`

### Expressions
- CASE WHEN/THEN/ELSE
- Subqueries
- Function calls

### Variables and Control Flow
- DECLARE @var TYPE
- SET @var = value
- IF/ELSE, BEGIN/END, TRY/CATCH
- Cursors (DECLARE, OPEN, FETCH, CLOSE, DEALLOCATE)

### Comments
- Single-line: `-- comment`
- Multi-line: `/* comment */`

## Project Phases

| Phase | Description | Status |
|-------|-------------|--------|
| 1     | Lexical Analysis (Tokenizer) | Complete |
| 2     | Syntax Analysis (Parser) | Complete (88%) |
| 3     | Abstract Syntax Tree | Planned |

## Test Results

| Test File | Status | Errors |
|-----------|--------|--------|
| parser_test_input.txt | PASS | 0 |
| phase1_test_input.txt | PARTIAL | 4 (nested comments) |
| Individual Features | PASS | 0 |

## Documentation

- `docs/HOW_TO_RUN.md` - Complete command reference
- `docs/QUICK_START.md` - Getting started guide
- `docs/FIXES_SUMMARY.md` - Implementation details
- `the-project-task/` - Project requirements

---

Built with ANTLR 4.13.2 | Damascus University - AI Department - Year 4
