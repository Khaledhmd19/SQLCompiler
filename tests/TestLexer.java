import org.antlr.v4.runtime.*;

public class TestLexer {
    public static void main(String[] args) throws Exception {
        String filePath = "test_tokens.sql";
        CharStream input = CharStreams.fromFileName(filePath);
        mysqllexer lexer = new mysqllexer(input);

        System.out.println("Testing lexer with: " + filePath);
        Token token;
        while ((token = lexer.nextToken()).getType() != Token.EOF) {
            String tokenName = mysqllexer.VOCABULARY.getDisplayName(token.getType());
            System.out.printf("%-15s : %s\n", tokenName, token.getText());
        }
    }
}
