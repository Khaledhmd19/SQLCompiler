package ast;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import parser.*;
import java.io.*;

/**
 * Main class for demonstrating AST construction from SQL input.
 *
 * Phase 3: Abstract Syntax Tree (AST) Construction
 *
 * This program:
 * 1. Reads SQL input from a file or stdin
 * 2. Performs lexical analysis (tokenization)
 * 3. Performs syntactic analysis (parsing)
 * 4. Builds an Abstract Syntax Tree (AST)
 * 5. Displays the AST in a tree format
 */
public class ASTMain {

    public static void main(String[] args) {
        try {
            CharStream input;
            String inputSource;

            if (args.length > 0) {
                // Read from file
                input = CharStreams.fromFileName(args[0]);
                inputSource = args[0];
            } else {
                // Read from stdin
                input = CharStreams.fromStream(System.in);
                inputSource = "stdin";
            }

            System.out.println("=".repeat(60));
            System.out.println("SQL Compiler - Phase 3: AST Construction");
            System.out.println("Input: " + inputSource);
            System.out.println("=".repeat(60));
            System.out.println();

            // Phase 1: Lexical Analysis
            System.out.println("Phase 1: Lexical Analysis (Tokenization)");
            System.out.println("-".repeat(40));
            mysqllexer lexer = new mysqllexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            tokens.fill();

            int tokenCount = tokens.getTokens().size();
            System.out.println("Total tokens: " + tokenCount);
            System.out.println();

            // Phase 2: Syntactic Analysis (Parsing)
            System.out.println("Phase 2: Syntactic Analysis (Parsing)");
            System.out.println("-".repeat(40));
            mysqlparser parser = new mysqlparser(tokens);

            // Custom error listener to count errors
            SyntaxErrorCounter errorCounter = new SyntaxErrorCounter();
            parser.removeErrorListeners();
            parser.addErrorListener(errorCounter);

            ParseTree tree = parser.sqlFile();

            if (errorCounter.getErrorCount() > 0) {
                System.out.println("Parse errors: " + errorCounter.getErrorCount());
                System.out.println("Cannot build AST due to syntax errors.");
                System.exit(1);
            }
            System.out.println("Parse successful - no syntax errors");
            System.out.println();

            // Phase 3: AST Construction
            System.out.println("Phase 3: AST Construction");
            System.out.println("-".repeat(40));
            ASTBuilderVisitor astBuilder = new ASTBuilderVisitor();
            ASTNode ast = astBuilder.visit(tree);

            if (ast == null) {
                System.out.println("Warning: AST is null (empty input or unsupported statements)");
                System.exit(0);
            }

            System.out.println("AST built successfully");
            System.out.println();

            // Display the AST
            System.out.println("=".repeat(60));
            System.out.println("ABSTRACT SYNTAX TREE");
            System.out.println("=".repeat(60));
            System.out.println();
            ast.print();
            System.out.println();
            System.out.println("=".repeat(60));
            System.out.println("End of AST");
            System.out.println("=".repeat(60));

        } catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
            System.exit(1);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
    }

    /**
     * Custom error listener to count syntax errors.
     */
    static class SyntaxErrorCounter extends BaseErrorListener {
        private int errorCount = 0;

        @Override
        public void syntaxError(Recognizer<?, ?> recognizer,
                                Object offendingSymbol,
                                int line,
                                int charPositionInLine,
                                String msg,
                                RecognitionException e) {
            errorCount++;
            System.err.println("Syntax error at line " + line + ":" + charPositionInLine + " - " + msg);
        }

        public int getErrorCount() {
            return errorCount;
        }
    }
}
