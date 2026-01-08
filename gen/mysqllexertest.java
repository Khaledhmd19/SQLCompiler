import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.gui.Trees;

public class mysqllexertest {
    public static void main(String[] args) throws Exception {

        String filePath = "testttt.txt";

        CharStream input =  CharStreams.fromFileName(filePath);

        mysqllexer lexer = new mysqllexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        mysqlparser parser = new mysqlparser(tokens);

        System.out.println("File Being Tested: " + filePath);
        System.out.println("---------------------------------------");

// ----------------------------------------------------
//      Lexer Testing
// ----------------------------------------------------
        int tokens_count = 0;


        Token token;
        while ((token = lexer.nextToken()).getType() != Token.EOF) {
            String tokenName = mysqllexer.VOCABULARY.getDisplayName(token.getType());

            System.out.printf("Type: %-20s Value: %s\n",
                    tokenName, token.getText());

            tokens_count++;
        }
        System.out.println("---------------------------------------");
        System.out.println("Tokens Count: " + tokens_count);

        lexer.reset();

// ----------------------------------------------------
//      Parser Testing
// ----------------------------------------------------
        ParseTree tree = parser.sqlFile();
        System.out.println("Parse Tree:");
        System.out.println(tree.toStringTree(parser));
        Trees.inspect(tree, parser);
    }
}