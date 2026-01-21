#!/bin/bash
# SQL Compiler - Test Runner
# Run from project root: ./scripts/run_tests.sh

# Get the project root directory (parent of scripts/)
PROJECT_ROOT="$(cd "$(dirname "$0")/.." && pwd)"
cd "$PROJECT_ROOT"

echo "==================================="
echo "SQL Compiler - Running Tests"
echo "==================================="

ANTLR_JAR="/usr/local/lib/antlr-4.13.2-complete.jar"
if [ ! -f "$ANTLR_JAR" ]; then
    echo "Error: ANTLR jar not found at $ANTLR_JAR"
    exit 1
fi

# Java classpath separator is OS-dependent:
# - Windows: ;
# - Linux/macOS: :
CP_SEP=":"
case "$(uname -s 2>/dev/null)" in
    CYGWIN*|MINGW*|MSYS*)
        CP_SEP=";"
        ;;
esac

echo ""
echo "Compiling tests..."
javac -cp "gen${CP_SEP}${ANTLR_JAR}" gen/*.java tests/Test*.java -d tests/
if [ $? -ne 0 ]; then
    echo "Error: compilation failed"
    exit 1
fi

CLASSPATH="tests${CP_SEP}gen${CP_SEP}${ANTLR_JAR}"

echo ""
echo "TEST 1: Simple SQL (parser_test_input.txt)"
echo "-------------------------------------------"
java -cp "$CLASSPATH" TestSimpleSQL
echo ""

echo "TEST 2: Complex SQL (phase1_test_input.txt)"
echo "-------------------------------------------"
java -cp "$CLASSPATH" TestComplexInput | tail -10
echo ""

echo "TEST 3: All Features"
echo "-------------------------------------------"
java -cp "$CLASSPATH" TestAll
echo ""
