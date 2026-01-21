#!/bin/bash
# SQL Compiler - Build Script
# Run from project root: ./scripts/compile.sh

# Get the project root directory (parent of scripts/)
PROJECT_ROOT="$(cd "$(dirname "$0")/.." && pwd)"
cd "$PROJECT_ROOT"

echo "==================================="
echo "Building SQL Compiler..."
echo "==================================="

# Step 1: Generate lexer and parser from grammar files
echo "Step 1: Generating lexer from mysqllexer.g4..."
cd src
java -jar /usr/local/lib/antlr-4.13.2-complete.jar mysqllexer.g4
if [ $? -ne 0 ]; then
    echo "ERROR: Failed to generate lexer"
    exit 1
fi

echo "Step 2: Generating parser from mysqlparser.g4..."
java -jar /usr/local/lib/antlr-4.13.2-complete.jar mysqlparser.g4
if [ $? -ne 0 ]; then
    echo "ERROR: Failed to generate parser"
    exit 1
fi

echo "Step 3: Moving generated files to gen/ directory..."
mv *.java *.interp ../gen/ 2>/dev/null
cd ..

# Step 2: Compile all Java files
echo "Step 4: Compiling Java files..."
javac -cp "gen:/usr/local/lib/antlr-4.13.2-complete.jar" gen/*.java tests/Test*.java -d tests/
if [ $? -ne 0 ]; then
    echo "ERROR: Compilation failed"
    exit 1
fi

echo ""
echo "==================================="
echo "Build completed successfully!"
echo "==================================="
echo ""
echo "You can now run the tests:"
echo "  ./scripts/run_tests.sh"
echo ""
