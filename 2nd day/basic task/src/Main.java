import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main extends StringSeparator{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputString = reader.readLine();
        String inputNumber = reader.readLine();
        int maxLength = Integer.parseInt(inputNumber);
        getStringLength(inputString);
        getSymbolsWithoutSpace(inputString);
        getStringOddOrOddness(inputString);
        compareStringLengthToMaxLength(inputString, maxLength);
        reader.close();
    }
}
