#!/bin/bash

# Script to compile and run AST demo
# Usage: ./scripts/run_ast.sh [sql_file]

PROJECT_DIR="$(cd "$(dirname "$0")/.." && pwd)"
cd "$PROJECT_DIR"

echo "========================================"
echo "SQL Compiler - AST Demo"
echo "========================================"
echo

# Check for ANTLR
ANTLR_JAR="/usr/local/lib/antlr-4.13.2-complete.jar"
if [ ! -f "$ANTLR_JAR" ]; then
    echo "Error: ANTLR jar not found at $ANTLR_JAR"
    exit 1
fi

# Step 1: Generate parser/lexer from grammar with package
echo "Step 1: Generating parser with package..."
mkdir -p gen/parser

# Generate lexer and parser into a package with visitor
java -jar "$ANTLR_JAR" -package parser -visitor -o gen/parser src/mysqllexer.g4
if [ $? -ne 0 ]; then
    echo "Error generating lexer"
    exit 1
fi

java -jar "$ANTLR_JAR" -package parser -visitor -o gen/parser src/mysqlparser.g4
if [ $? -ne 0 ]; then
    echo "Error generating parser"
    exit 1
fi
echo "Parser generated successfully"
echo

# Step 2: Compile all Java files
echo "Step 2: Compiling Java files..."
mkdir -p bin

# Compile generated parser files
echo "  Compiling parser..."
javac -cp "$ANTLR_JAR" -d bin gen/parser/src/*.java
if [ $? -ne 0 ]; then
    echo "Error compiling parser files"
    exit 1
fi

# Compile AST classes
echo "  Compiling AST classes..."
javac -cp "$ANTLR_JAR:bin" -d bin src/ast/*.java src/ast/nodes/*.java
if [ $? -ne 0 ]; then
    echo "Error compiling AST files"
    exit 1
fi
echo "Compilation successful"
echo

# Step 3: Run AST demo
echo "Step 3: Running AST demo..."
echo

if [ -n "$1" ]; then
    # Run with file argument
    java -cp "$ANTLR_JAR:bin" ast.ASTMain "$1"
else
    # Show usage
    echo "Usage: $0 <sql_file>"
    echo
    echo "Example:"
    echo "  $0 tests/input/train.sql"
    echo "  $0 tests/input/simple_example.sql"
    echo
    echo "Or pipe SQL directly:"
    echo "  echo 'SELECT * FROM users;' | $0 /dev/stdin"
fi
