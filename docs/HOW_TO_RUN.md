# How to Run Your SQL Compiler - Complete Guide

## Available Test Commands

# ./scripts/compile.sh

### **Option 1: Simple Tests (Just Results)**
```bash
# Build project
./scripts/compile.sh

# Run all tests (shows only SUCCESS/FAIL)
./scripts/run_tests.sh
```

### **Option 2: Detailed Tests (Shows Everything!)**
```bash
# See tokens, parse tree, and detailed analysis
`./scripts/test_detailed.sh tests/input/simple_example.sql`
./scripts/test_detailed.sh tests/input/parser_test_input.txt
./scripts/test_detailed.sh tests/input/demo.sql
```

---

## What Each Test Shows

### **1. Simple Test (`./scripts/run_tests.sh`)**
```
TEST 1: Simple SQL
Result: SUCCESS
Errors: 0

TEST 2: Complex SQL
Result: FAIL (4 errors)

TEST 3: All Features
- Qualified table names
- Bracketed identifiers
- CASE expressions
...
```

**Use when:** You just want to know if it works or fails

---

### **2. Detailed Test (`./scripts/test_detailed.sh file.sql`)**
```
STEP 1: LEXICAL ANALYSIS
-------------------------
SELECT -> Token: SELECT
name   -> Token: ID
,      -> Token: ','
...

STEP 2: SYNTAX ANALYSIS
-----------------------
sqlFile
  statement
    selectStatement
      SELECT clause
      FROM clause
      WHERE clause

STEP 3: SUMMARY
---------------
Tokens: 11
Errors: 0
Result: SUCCESS
```

**Use when:** You want to understand what the compiler is doing

---

## All Available Commands

### **Build Commands:**
```bash
./scripts/compile.sh                    # Build everything
```

### **Test Commands:**
```bash
./scripts/run_tests.sh                  # Run all tests (quick)
./scripts/test_detailed.sh <file>       # Detailed analysis of one file
./scripts/show_tree.sh <file>           # Visual parse tree
```

### **Manual Test Commands:**
```bash
CLASSPATH="tests:gen:/usr/local/lib/antlr-4.13.2-complete.jar"

# Quick test (just result)
java -cp "$CLASSPATH" TestSimpleSQL

# Complex test
java -cp "$CLASSPATH" TestComplexInput

# All features test
java -cp "$CLASSPATH" TestAll

# Detailed analysis
java -cp "$CLASSPATH" TestDetailed tests/input/demo.sql
```

---

## Step-by-Step Tutorial

### **Example 1: Test Your Own SQL**

```bash
# 1. Create your SQL file
cat > tests/input/my_query.sql << 'EOF'
SELECT student_id, name, grade
FROM students
WHERE grade >= 75 AND department = 'AI';
EOF

# 2. Run detailed test
./scripts/test_detailed.sh tests/input/my_query.sql

# 3. You'll see:
#    - All tokens (SELECT, ID:student_id, ID:name, etc.)
#    - Parse tree structure
#    - Result: SUCCESS or errors
```

### **Example 2: Test Advanced Features**

```bash
# Test CASE expression
echo "SELECT CASE WHEN x > 5 THEN 'big' ELSE 'small' END FROM t;" > tests/input/test_case.sql
./scripts/test_detailed.sh tests/input/test_case.sql

# Test variables
echo "DECLARE @count INT; SET @count = 10;" > tests/input/test_var.sql
./scripts/test_detailed.sh tests/input/test_var.sql

# Test IF statement
echo "IF NOT EXISTS (SELECT 1 FROM users) BEGIN SELECT 'empty'; END" > tests/input/test_if.sql
./scripts/test_detailed.sh tests/input/test_if.sql
```

---

## Understanding the Output

### **Success (0 errors):**
```
Parsing completed successfully!

Parse Tree:
sqlFile
  statement (recognized!)
    selectStatement (understood!)

Result: SUCCESS
Your SQL was parsed successfully!
```

**Meaning:** Your compiler understood everything perfectly!

### **Failure (with errors):**
```
ERROR #1:
  Line: 1, Column: 15
  Message: missing FROM clause
  Offending token: 'WHERE'

Result: FAILED
Errors: 1
```

**Meaning:** Something is wrong at line 1, column 15

---

## Common Issues & Solutions

### **Issue 1: Permission Denied**
```bash
# Problem:
bash: ./scripts/compile.sh: Permission denied

# Solution:
chmod +x scripts/*.sh
```

### **Issue 2: Class Not Found**
```bash
# Problem:
Error: Could not find or load main class TestDetailed

# Solution:
./scripts/compile.sh    # Rebuild everything
```

### **Issue 3: Cannot Find File**
```bash
# Problem:
Error: File 'test.sql' not found!

# Solution:
ls tests/input/*.sql        # Check available SQL files
# Or create your file first:
echo "SELECT * FROM t;" > tests/input/test.sql
```

---

## Files in Your Project

### **Grammar Files (src/)**
- `mysqllexer.g4` - Defines tokens (keywords, numbers, strings, etc.)
- `mysqlparser.g4` - Defines grammar rules (SELECT, INSERT, etc.)

### **Generated Files (gen/)**
- `mysqllexer.java` - Lexer implementation
- `mysqlparser.java` - Parser implementation
- `*.class` - Compiled Java classes

### **Test Files (tests/input/)**
- `parser_test_input.txt` - Simple SQL (6 statements)
- `phase1_test_input.txt` - Complex SQL (real-world example)
- `demo.sql` - Advanced features demo
- `simple_example.sql` - Single statement example

### **Test Programs (tests/)**
- `TestSimpleSQL.java` - Quick test (result only)
- `TestComplexInput.java` - Complex SQL test
- `TestAll.java` - All features test
- `TestDetailed.java` - Detailed analysis (tokens + tree)

### **Scripts (scripts/)**
- `compile.sh` - Build everything
- `run_tests.sh` - Run all tests
- `test_detailed.sh` - Run detailed test on any file
- `show_tree.sh` - Visual parse tree

### **Documentation (docs/)**
- `HOW_TO_RUN.md` - This file
- `QUICK_START.md` - Quick reference
- `UNDERSTANDING_OUTPUT.md` - Output explanation
- `FIXES_SUMMARY.md` - What was fixed

---

## Quick Reference Card

```bash
# ONE-LINERS

# Build and test everything:
./scripts/compile.sh && ./scripts/run_tests.sh

# Detailed test of simple SQL:
./scripts/test_detailed.sh tests/input/simple_example.sql

# Test your own SQL:
echo "YOUR SQL HERE;" > tests/input/test.sql && ./scripts/test_detailed.sh tests/input/test.sql

# See only tokens (lexer output):
java -cp "tests:gen:/usr/local/lib/antlr-4.13.2-complete.jar" TestLexer

# Full rebuild:
rm -rf gen/*.class tests/*.class && ./scripts/compile.sh
```

---

## For Your Project Presentation

### **Show These Steps:**

1. **Build the compiler:**
   ```bash
   ./scripts/compile.sh
   ```

2. **Run simple test:**
   ```bash
   ./scripts/run_tests.sh
   ```
   -> Shows: SUCCESS

3. **Show detailed analysis:**
   ```bash
   ./scripts/test_detailed.sh tests/input/demo.sql
   ```
   -> Shows: Tokens, Parse Tree, Success

4. **Explain the output:**
   - Point to tokens in STEP 1
   - Point to parse tree in STEP 2
   - Point to success message

---

## Success Checklist

Before presenting:
- [ ] Run `./scripts/compile.sh` (builds successfully)
- [ ] Run `./scripts/run_tests.sh` (shows results)
- [ ] Run `./scripts/test_detailed.sh tests/input/demo.sql` (shows detailed output)
- [ ] Read `docs/UNDERSTANDING_OUTPUT.md` (understand what you're seeing)

---

**You're ready! Your compiler works!**
