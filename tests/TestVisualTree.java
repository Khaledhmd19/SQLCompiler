import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.gui.Trees;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class TestVisualTree {
    // ANSI color codes for terminal
    public static final String RESET = "\033[0m";
    public static final String BLUE = "\033[34m";
    public static final String GREEN = "\033[32m";
    public static final String YELLOW = "\033[33m";
    public static final String CYAN = "\033[36m";
    public static final String MAGENTA = "\033[35m";
    public static final String BOLD = "\033[1m";
    public static final String RED = "\033[31m";

    private static boolean useColors = true;

    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.out.println("Usage: java TestVisualTree <sql_file> [options]");
            System.out.println("\nOptions:");
            System.out.println("  --gui           Show graphical tree in window");
            System.out.println("  --no-color      Disable colors in terminal");
            System.out.println("  --full-tree     Show complete tree (very detailed)");
            System.out.println("\nExamples:");
            System.out.println("  java TestVisualTree demo.sql");
            System.out.println("  java TestVisualTree demo.sql --gui");
            System.out.println("  java TestVisualTree demo.sql --full-tree");
            return;
        }

        String filePath = args[0];
        boolean showGui = false;
        boolean fullTree = false;

        // Parse arguments
        for (int i = 1; i < args.length; i++) {
            if (args[i].equals("--gui")) {
                showGui = true;
            } else if (args[i].equals("--no-color")) {
                useColors = false;
            } else if (args[i].equals("--full-tree")) {
                fullTree = true;
            }
        }

        System.out.println(BOLD + CYAN + "╔════════════════════════════════════════════════════════════╗" + RESET);
        System.out.println(BOLD + CYAN + "║           SQL COMPILER - VISUAL PARSE TREE                 ║" + RESET);
        System.out.println(BOLD + CYAN + "╚════════════════════════════════════════════════════════════╝" + RESET);
        System.out.println();
        System.out.println(BOLD + "File: " + YELLOW + filePath + RESET);
        System.out.println();

        // Parse the file
        CharStream input = CharStreams.fromFileName(filePath);
        mysqllexer lexer = new mysqllexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        mysqlparser parser = new mysqlparser(tokens);

        // Track errors
        parser.removeErrorListeners();
        final int[] errorCount = {0};
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                    int line, int charPositionInLine, String msg,
                                    RecognitionException e) {
                errorCount[0]++;
                System.err.println(RED + "✗ ERROR at Line " + line + ":" + charPositionInLine + RESET);
                System.err.println("  " + msg);
            }
        });

        ParseTree tree = parser.sqlFile();

        if (errorCount[0] > 0) {
            System.out.println(RED + "\n✗ Parsing failed with " + errorCount[0] + " error(s)" + RESET);
            System.out.println();
        } else {
            System.out.println(GREEN + "✓ Parsing successful!" + RESET);
            System.out.println();
        }

        // Show tree in terminal
        System.out.println(BOLD + CYAN + "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + RESET);
        System.out.println(BOLD + "PARSE TREE VISUALIZATION" + RESET);
        System.out.println(CYAN + "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + RESET);
        System.out.println();

        printColorfulTree(tree, parser, "", true, 0, fullTree ? 100 : 4);

        System.out.println();
        System.out.println(CYAN + "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + RESET);

        // Show statistics
        int nodeCount = countNodes(tree);
        int depth = getTreeDepth(tree);
        System.out.println();
        System.out.println(BOLD + "TREE STATISTICS:" + RESET);
        System.out.println("  Nodes: " + YELLOW + nodeCount + RESET);
        System.out.println("  Depth: " + YELLOW + depth + RESET);
        System.out.println("  Result: " + (errorCount[0] == 0 ? GREEN + "✓ SUCCESS" : RED + "✗ FAILED") + RESET);
        System.out.println();

        // Show GUI if requested
        if (showGui) {
            System.out.println(CYAN + "Opening graphical tree viewer..." + RESET);
            Trees.inspect(tree, parser);
        }

        if (!showGui) {
            System.out.println(BOLD + "Tip: " + RESET + "Use " + YELLOW + "--gui" + RESET + " flag to see graphical tree");
            System.out.println("     Example: " + CYAN + "java -cp \".:gen:/usr/local/lib/antlr-4.13.2-complete.jar\" TestVisualTree " + filePath + " --gui" + RESET);
        }
        System.out.println();
    }

    private static void printColorfulTree(ParseTree tree, Parser parser, String indent,
                                         boolean last, int depth, int maxDepth) {
        if (depth > maxDepth) {
            return;
        }

        // Get node name and color
        String nodeName;
        String color;
        boolean isTerminal = tree instanceof TerminalNode;

        if (isTerminal) {
            nodeName = tree.getText();
            if (nodeName.length() > 30) {
                nodeName = nodeName.substring(0, 27) + "...";
            }
            nodeName = "\"" + nodeName + "\"";
            color = YELLOW; // Terminals in yellow
        } else {
            int ruleIndex = ((RuleContext) tree).getRuleIndex();
            nodeName = parser.getRuleNames()[ruleIndex];

            // Color code based on rule type
            if (nodeName.contains("statement") || nodeName.equals("sqlFile")) {
                color = BOLD + BLUE; // Main structures in bold blue
            } else if (nodeName.contains("Clause") || nodeName.contains("Expression")) {
                color = GREEN; // Clauses in green
            } else if (nodeName.contains("literal") || nodeName.contains("Name")) {
                color = CYAN; // Literals/names in cyan
            } else {
                color = MAGENTA; // Others in magenta
            }
        }

        // Print the branch
        System.out.print(indent);
        if (last) {
            System.out.print(useColors ? CYAN : "");
            System.out.print("└── ");
            indent += "    ";
        } else {
            System.out.print(useColors ? CYAN : "");
            System.out.print("├── ");
            indent += "│   ";
        }

        // Print the node
        if (useColors) {
            System.out.println(color + nodeName + RESET);
        } else {
            System.out.println(nodeName);
        }

        // Print children
        if (!isTerminal) {
            int childCount = tree.getChildCount();
            for (int i = 0; i < childCount; i++) {
                printColorfulTree(tree.getChild(i), parser, indent, i == childCount - 1, depth + 1, maxDepth);
            }
        }
    }

    private static int countNodes(ParseTree tree) {
        int count = 1;
        for (int i = 0; i < tree.getChildCount(); i++) {
            count += countNodes(tree.getChild(i));
        }
        return count;
    }

    private static int getTreeDepth(ParseTree tree) {
        if (tree.getChildCount() == 0) {
            return 1;
        }
        int maxDepth = 0;
        for (int i = 0; i < tree.getChildCount(); i++) {
            maxDepth = Math.max(maxDepth, getTreeDepth(tree.getChild(i)));
        }
        return maxDepth + 1;
    }
}
