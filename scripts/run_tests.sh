#!/bin/bash
# SQL Compiler - Test Runner
# Run from project root: ./scripts/run_tests.sh

# Get the project root directory (parent of scripts/)
PROJECT_ROOT="$(cd "$(dirname "$0")/.." && pwd)"
cd "$PROJECT_ROOT"

echo "==================================="
echo "SQL Compiler - Running Tests"
echo "==================================="

CLASSPATH="tests:gen:/usr/local/lib/antlr-4.13.2-complete.jar"

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
