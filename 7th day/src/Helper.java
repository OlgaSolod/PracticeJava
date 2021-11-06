import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Helper {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        System.out.println(helper(string, 50, "тест"));
    }

    public static String helper(String str, int maxLength, String end) {
        if (str.length() > maxLength) {
            return str;
        }
        //Разделяем строку по пробелам
        String[] strArray = str.split(" ");
        StringBuilder newStr = new StringBuilder();
        for (String partArray : strArray
        ) {
            if (newStr.length() > maxLength) {
                break;
            }
            newStr.append(partArray);
        }
        newStr.append(end);
        return newStr.toString();
    }
}
