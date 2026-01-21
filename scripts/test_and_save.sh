#!/bin/bash
# Run detailed test and save output to file
# Run from project root: ./scripts/test_and_save.sh <sql_file>

# Get the project root directory (parent of scripts/)
PROJECT_ROOT="$(cd "$(dirname "$0")/.." && pwd)"
cd "$PROJECT_ROOT"

if [ "$#" -eq 0 ]; then
    echo "Usage: ./scripts/test_and_save.sh <sql_file>"
    echo ""
    echo "This will:"
    echo "  1. Run detailed analysis"
    echo "  2. Show output on screen"
    echo "  3. Save to <sql_file>_analysis.txt"
    echo ""
    echo "Example:"
    echo "  ./scripts/test_and_save.sh tests/input/demo.sql"
    echo "  Output saved to: tests/input/demo.sql_analysis.txt"
    exit 1
fi

SQL_FILE="$1"
OUTPUT_FILE="${SQL_FILE}_analysis.txt"

if [ ! -f "$SQL_FILE" ]; then
    echo "Error: File '$SQL_FILE' not found!"
    exit 1
fi

echo "Testing: $SQL_FILE"
echo "Saving output to: $OUTPUT_FILE"
echo ""

# Run test and save to file AND show on screen
java -cp "tests:gen:/usr/local/lib/antlr-4.13.2-complete.jar" TestDetailed "$SQL_FILE" 2>&1 | tee "$OUTPUT_FILE"

echo ""
echo "Output saved to: $OUTPUT_FILE"
echo ""
echo "You can:"
echo "  - View file: cat $OUTPUT_FILE"
echo "  - Edit file: nano $OUTPUT_FILE"
echo "  - Count tokens: grep \"'\" $OUTPUT_FILE | wc -l"
