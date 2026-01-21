# Quick Start Guide - SQL Compiler

## Run Your SQL Compiler (3 Easy Steps)

### **Step 1: Build the Project**
```bash
./scripts/compile.sh
```
This will:
- Generate lexer from `mysqllexer.g4`
- Generate parser from `mysqlparser.g4`
- Compile all Java files

### **Step 2: Run the Tests**
```bash
./scripts/run_tests.sh
```
This will test:
- Simple SQL statements
- Complex SQL statements
- All individual features

### **Step 3: View Results**
You should see:
```
PASS - Simple SQL (0 errors)
FAIL - Complex SQL (4 errors - nested comments only)
PASS - All individual features
```

---

## Test Your Own SQL

### Quick Test
```bash
# 1. Create your SQL file
echo "SELECT name FROM users WHERE age > 18;" > tests/input/test.sql

# 2. Run detailed test
./scripts/test_detailed.sh tests/input/test.sql
```

### Create Custom Test Program
```bash
# 1. Create test program
cat > tests/TestMy.java << 'EOF'
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class TestMy {
    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromFileName("tests/input/test.sql");
        mysqllexer lexer = new mysqllexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        mysqlparser parser = new mysqlparser(tokens);

        ParseTree tree = parser.sqlFile();

        System.out.println("Errors: " + parser.getNumberOfSyntaxErrors());
        if (parser.getNumberOfSyntaxErrors() == 0) {
            System.out.println("SUCCESS!");
        }
    }
}
EOF

# 2. Compile and run
javac -cp "gen:/usr/local/lib/antlr-4.13.2-complete.jar" tests/TestMy.java -d tests/
java -cp "tests:gen:/usr/local/lib/antlr-4.13.2-complete.jar" TestMy
```

---

## Common Commands

### Build Only
```bash
./scripts/compile.sh
```

### Test Simple SQL
```bash
java -cp "tests:gen:/usr/local/lib/antlr-4.13.2-complete.jar" TestSimpleSQL
```

### Test Complex SQL
```bash
java -cp "tests:gen:/usr/local/lib/antlr-4.13.2-complete.jar" TestComplexInput
```

### Test All Features
```bash
java -cp "tests:gen:/usr/local/lib/antlr-4.13.2-complete.jar" TestAll
```

### Clean Build (if needed)
```bash
rm -rf gen/*.class tests/*.class
./scripts/compile.sh
```

---

## What Works

Your compiler supports:
- SELECT, INSERT, UPDATE, DELETE
- CREATE, ALTER, DROP TABLE
- WHERE, JOIN, GROUP BY, ORDER BY
- CASE WHEN expressions
- IN, BETWEEN, LIKE operators
- Variable declarations (`DECLARE @var VARCHAR(100)`)
- IF/ELSE, BEGIN/END blocks
- TRY/CATCH error handling
- Bracketed identifiers `[User ID]`
- Qualified names `sys.columns`
- Function calls
- Subqueries

---

## One-Line Commands

**Build and Test:**
```bash
./scripts/compile.sh && ./scripts/run_tests.sh
```

**Quick SQL Test:**
```bash
echo "SELECT * FROM users;" > tests/input/test.sql && ./scripts/test_detailed.sh tests/input/test.sql
```

---

## Expected Results

### Success Output
```
Testing: tests/input/parser_test_input.txt
Result: SUCCESS
Errors: 0
```

### Known Issues Output
```
Testing file: tests/input/phase1_test_input.txt
Line 80:0 extraneous input '*'
Errors: 4
```
*These 4 errors are from nested comments on lines 77-80 (optional feature)*

---

## Troubleshooting

**Problem:** `bash: ./scripts/compile.sh: Permission denied`
```bash
chmod +x scripts/*.sh
```

**Problem:** `cannot find symbol: class mysqllexer`
```bash
# Regenerate everything
./scripts/compile.sh
```

**Problem:** `Class not found: TestSimpleSQL`
```bash
# Make sure you're in the Compiler directory
cd /home/zaid-amaneh/my-projects/Compiler
./scripts/compile.sh
```

---

**That's it! Your SQL compiler is ready to use!**
