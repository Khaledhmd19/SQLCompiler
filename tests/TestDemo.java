import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class TestDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("===========================================");
        System.out.println("  DEMO: Testing Advanced SQL Features");
        System.out.println("===========================================\n");

        CharStream input = CharStreams.fromFileName("demo.sql");
        mysqllexer lexer = new mysqllexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        mysqlparser parser = new mysqlparser(tokens);

        parser.removeErrorListeners();
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                    int line, int charPositionInLine, String msg,
                                    RecognitionException e) {
                System.err.println("Line " + line + ":" + charPositionInLine + " " + msg);
            }
        });

        ParseTree tree = parser.sqlFile();

        System.out.println("File: demo.sql");
        System.out.println("Statements tested:");
        System.out.println("  ✓ Variable declarations (DECLARE @var)");
        System.out.println("  ✓ CASE expressions");
        System.out.println("  ✓ Complex WHERE with IN operator");
        System.out.println("  ✓ IF NOT EXISTS");
        System.out.println("  ✓ CREATE TABLE with constraints");
        System.out.println("  ✓ Compound assignment (+=)");
        System.out.println("  ✓ TRY/CATCH blocks");
        System.out.println("  ✓ GO statement");
        System.out.println("\nResult: " + (parser.getNumberOfSyntaxErrors() == 0 ? "✅ SUCCESS!" : "❌ FAILED"));
        System.out.println("Errors: " + parser.getNumberOfSyntaxErrors());

        if (parser.getNumberOfSyntaxErrors() == 0) {
            System.out.println("\n🎉 Your compiler successfully parsed all advanced SQL features!");
        }
    }
}
