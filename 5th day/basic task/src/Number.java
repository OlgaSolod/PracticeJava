import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;
        try {
            num = Integer.parseInt(reader.readLine());
            if (num < 0) {
                System.out.println("Вы ввели отрицательное число");
            } else if (num > 99) {
                System.out.println("Вы ввели трехзначное число");
            } else if (num >= 0 && num <= 9) {
                System.out.println("Вы ввели однозначное число");
            }
        } catch (IOException e) {
            System.out.println("Вы ввели не число");
        }
        System.out.println(checkTwoFigure(num));
    }

    static boolean checkTwoFigure(int number) {
        int secondDigit = number % 10;
        int firstDigit = (number - secondDigit) / 10;
        boolean sumOfDigits = (secondDigit + firstDigit == 10);
        return (secondDigit == firstDigit || sumOfDigits);


    }

}
