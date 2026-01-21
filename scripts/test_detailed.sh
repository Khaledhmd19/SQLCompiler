#!/bin/bash
# Run detailed test on any SQL file
# Run from project root: ./scripts/test_detailed.sh <sql_file>

# Get the project root directory (parent of scripts/)
PROJECT_ROOT="$(cd "$(dirname "$0")/.." && pwd)"
cd "$PROJECT_ROOT"

if [ "$#" -eq 0 ]; then
    echo "Usage: ./scripts/test_detailed.sh <sql_file>"
    echo ""
    echo "Examples:"
    echo "  ./scripts/test_detailed.sh tests/input/simple_example.sql"
    echo "  ./scripts/test_detailed.sh tests/input/parser_test_input.txt"
    echo "  ./scripts/test_detailed.sh tests/input/phase1_test_input.txt"
    echo "  ./scripts/test_detailed.sh tests/input/demo.sql"
    exit 1
fi

SQL_FILE="$1"

if [ ! -f "$SQL_FILE" ]; then
    echo "Error: File '$SQL_FILE' not found!"
    exit 1
fi

echo "Testing: $SQL_FILE"
echo ""

java -cp "tests:gen:/usr/local/lib/antlr-4.13.2-complete.jar" TestDetailed "$SQL_FILE"
