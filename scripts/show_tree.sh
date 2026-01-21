#!/bin/bash
# Show beautiful parse tree visualization
# Run from project root: ./scripts/show_tree.sh <sql_file>

# Get the project root directory (parent of scripts/)
PROJECT_ROOT="$(cd "$(dirname "$0")/.." && pwd)"
cd "$PROJECT_ROOT"

CLASSPATH="tests:gen:/usr/local/lib/antlr-4.13.2-complete.jar"

if [ "$#" -eq 0 ]; then
    echo "Usage: ./scripts/show_tree.sh <sql_file> [options]"
    echo ""
    echo "Options:"
    echo "  --gui           Show graphical tree window"
    echo "  --no-color      Disable colors"
    echo "  --full-tree     Show complete tree (very detailed)"
    echo ""
    echo "Examples:"
    echo "  ./scripts/show_tree.sh tests/input/demo.sql"
    echo "  ./scripts/show_tree.sh tests/input/demo.sql --gui"
    echo "  ./scripts/show_tree.sh tests/input/simple_example.sql --full-tree"
    exit 1
fi

java -cp "$CLASSPATH" TestVisualTree "$@"
