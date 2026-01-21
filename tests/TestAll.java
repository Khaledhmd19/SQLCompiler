import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class TestAll {
    public static void main(String[] args) throws Exception {
        System.out.println("===========================================");
        System.out.println("SQL COMPILER - COMPREHENSIVE TEST");
        System.out.println("===========================================\n");

        // Test 1: Simple SQL
        System.out.println("TEST 1: Simple SQL Statements");
        System.out.println("-------------------------------------------");
        testFile("tests/input/parser_test_input.txt");

        // Test 2: Complex SQL
        System.out.println("\nTEST 2: Complex SQL (phase1_test_input.txt)");
        System.out.println("-------------------------------------------");
        testFile("tests/input/phase1_test_input.txt");

        // Test 3: Individual features
        System.out.println("\nTEST 3: Individual Features");
        System.out.println("-------------------------------------------");
        testSQL("SELECT * FROM sys.columns;", "Qualified table names");
        testSQL("SELECT [User ID] FROM [dbo].[Users];", "Bracketed identifiers");
        testSQL("DECLARE @name VARCHAR(100);", "Variable declaration");
        testSQL("SELECT CASE WHEN x > 5 THEN 'big' ELSE 'small' END;", "CASE expression");
        testSQL("SELECT * WHERE id IN (1,2,3);", "IN operator");
        testSQL("IF NOT EXISTS (SELECT 1 FROM t) BEGIN SELECT 1; END", "IF NOT EXISTS");
        testSQL("SET @x += 5;", "Compound assignment");

        System.out.println("\n===========================================");
        System.out.println("TEST SUMMARY COMPLETE");
        System.out.println("===========================================");
    }

    private static void testFile(String filePath) {
        try {
            CharStream input = CharStreams.fromFileName(filePath);
            mysqllexer lexer = new mysqllexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            mysqlparser parser = new mysqlparser(tokens);

            parser.removeErrorListeners();
            ParseTree tree = parser.sqlFile();

            int errors = parser.getNumberOfSyntaxErrors();
            System.out.println("File: " + filePath);
            System.out.println("Result: " + (errors == 0 ? "✓ PASS" : "✗ FAIL (" + errors + " errors)"));
        } catch (Exception e) {
            System.out.println("File: " + filePath);
            System.out.println("Result: ✗ ERROR - " + e.getMessage());
        }
    }

    private static void testSQL(String sql, String description) {
        try {
            CharStream input = CharStreams.fromString(sql);
            mysqllexer lexer = new mysqllexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            mysqlparser parser = new mysqlparser(tokens);

            parser.removeErrorListeners();
            ParseTree tree = parser.sqlFile();

            int errors = parser.getNumberOfSyntaxErrors();
            System.out.println((errors == 0 ? "✓" : "✗") + " " + description);
        } catch (Exception e) {
            System.out.println("✗ " + description + " - ERROR");
        }
    }
}
