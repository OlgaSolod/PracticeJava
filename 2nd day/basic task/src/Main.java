import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputString = reader.readLine();
        String inputNumber = reader.readLine();
        int maxLength = Integer.parseInt(inputNumber);
        System.out.println("Длина строки: " + inputString.length());
        System.out.println("Длина строки без пробелов: " + inputString.replace(" ", "").length());
        System.out.println("Количество символов в строке: " + (inputString.length() % 2 == 0 ? "четное" : "нечетное"));
        if (inputString.length() > maxLength) {
            System.out.println("Длина текста превышает длину " + maxLength + " символов");
        }
        reader.close();
    }
}
