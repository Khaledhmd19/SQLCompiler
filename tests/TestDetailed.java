import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class TestDetailed {
    public static void main(String[] args) throws Exception {
        String filePath = args.length > 0 ? args[0] : "parser_test_input.txt";

        System.out.println("╔═══════════════════════════════════════════════════════════╗");
        System.out.println("║         DETAILED SQL COMPILER OUTPUT                     ║");
        System.out.println("╚═══════════════════════════════════════════════════════════╝");
        System.out.println();
        System.out.println("File: " + filePath);
        System.out.println();

        // ============================================
        // STEP 1: LEXICAL ANALYSIS (Tokenization)
        // ============================================
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("STEP 1: LEXICAL ANALYSIS (Breaking text into tokens)");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println();

        CharStream input = CharStreams.fromFileName(filePath);
        mysqllexer lexer = new mysqllexer(input);

        // Show first 50 tokens
        System.out.println("Tokens Generated:");
        System.out.println(String.format("%-8s %-20s %-30s", "Line:Col", "Token Type", "Text"));
        System.out.println("─────────────────────────────────────────────────────────────");

        Token token;
        int tokenCount = 0;

        // Show ALL tokens (no limit)
        while ((token = lexer.nextToken()).getType() != Token.EOF) {
            String tokenName = mysqllexer.VOCABULARY.getDisplayName(token.getType());
            String text = token.getText();

            // Don't truncate - show full text
            // But replace newlines with \n for readability
            text = text.replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t");

            if (text.length() > 40) {
                System.out.println(String.format("%-8s %-20s %-40s",
                    token.getLine() + ":" + token.getCharPositionInLine(),
                    tokenName,
                    "'" + text.substring(0, 37) + "...'"));
            } else {
                System.out.println(String.format("%-8s %-20s %s",
                    token.getLine() + ":" + token.getCharPositionInLine(),
                    tokenName,
                    "'" + text + "'"));
            }
            tokenCount++;
        }

        System.out.println();
        System.out.println("Total Tokens Shown: " + tokenCount);
        System.out.println();

        // Reset lexer for parser
        lexer.reset();

        // ============================================
        // STEP 2: SYNTAX ANALYSIS (Parsing)
        // ============================================
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("STEP 2: SYNTAX ANALYSIS (Building parse tree)");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println();

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        mysqlparser parser = new mysqlparser(tokens);

        // Custom error listener to show detailed errors
        parser.removeErrorListeners();
        final int[] errorCount = {0};
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                    int line, int charPositionInLine, String msg,
                                    RecognitionException e) {
                errorCount[0]++;
                System.err.println("ERROR #" + errorCount[0] + ":");
                System.err.println("  Line: " + line + ", Column: " + charPositionInLine);
                System.err.println("  Message: " + msg);
                if (offendingSymbol instanceof Token) {
                    Token t = (Token) offendingSymbol;
                    System.err.println("  Offending token: '" + t.getText() + "'");
                }
                System.err.println();
            }
        });

        // Parse the input
        System.out.println("Parsing...");
        ParseTree tree = parser.sqlFile();

        if (errorCount[0] == 0) {
            System.out.println("✓ Parsing completed successfully!");
        } else {
            System.out.println("✗ Parsing completed with errors.");
        }
        System.out.println();

        // ============================================
        // STEP 3: PARSE TREE
        // ============================================
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("STEP 3: PARSE TREE STRUCTURE");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println();

        // Show simplified parse tree
        System.out.println("Parse Tree (simplified):");
        System.out.println();
        printTree(tree, parser, "", true);
        System.out.println();

        // ============================================
        // STEP 4: SUMMARY
        // ============================================
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("SUMMARY");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println();
        System.out.println("File: " + filePath);
        System.out.println("Tokens: " + tokenCount + (token.getType() != Token.EOF ? "+" : ""));
        System.out.println("Syntax Errors: " + errorCount[0]);
        System.out.println("Result: " + (errorCount[0] == 0 ? "✅ SUCCESS" : "❌ FAILED"));
        System.out.println();

        if (errorCount[0] == 0) {
            System.out.println("🎉 Your SQL was parsed successfully!");
            System.out.println("The compiler understood all the statements.");
        }
    }

    // Helper method to print parse tree in a readable format
    private static void printTree(ParseTree tree, Parser parser, String indent, boolean last) {
        String nodeName;
        if (tree instanceof TerminalNode) {
            nodeName = tree.getText();
            if (nodeName.length() > 30) {
                nodeName = nodeName.substring(0, 27) + "...";
            }
            nodeName = "\"" + nodeName + "\"";
        } else {
            int ruleIndex = ((RuleContext) tree).getRuleIndex();
            nodeName = parser.getRuleNames()[ruleIndex];
        }

        System.out.print(indent);
        if (last) {
            System.out.print("└─ ");
            indent += "   ";
        } else {
            System.out.print("├─ ");
            indent += "│  ";
        }
        System.out.println(nodeName);

        // Only show first level children to avoid too much detail
        int childCount = tree.getChildCount();
        if (childCount > 0 && !(tree instanceof TerminalNode) && indent.length() < 12) {
            for (int i = 0; i < childCount; i++) {
                printTree(tree.getChild(i), parser, indent, i == childCount - 1);
            }
        }
    }
}
