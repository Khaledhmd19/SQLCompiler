import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.Token;

public class mysqllexertest {
    public static void main(String[] args) throws Exception {

        String filePath = "test.txt";


        CharStream input = CharStreams.fromFileName(filePath);


        mysqllexer lexer = new mysqllexer(input);

        System.out.println("File Being Tested: " + filePath);
        System.out.println("---------------------------------------");

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
    }
}