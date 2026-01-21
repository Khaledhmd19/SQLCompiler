import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class TestComplexInput {
    public static void main(String[] args) throws Exception {
        String filePath = "tests/input/phase1_test_input.txt";
        CharStream input = CharStreams.fromFileName(filePath);
        mysqllexer lexer = new mysqllexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        mysqlparser parser = new mysqlparser(tokens);

        // Add error listener
        parser.removeErrorListeners();
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                    int line, int charPositionInLine, String msg,
                                    RecognitionException e) {
                System.err.println("Line " + line + ":" + charPositionInLine + " " + msg);
            }
        });

        System.out.println("Testing file: " + filePath);
        System.out.println("=======================================");

        ParseTree tree = parser.sqlFile();

        System.out.println("\n\nParse completed!");
        System.out.println("Errors: " + parser.getNumberOfSyntaxErrors());
    }
}
