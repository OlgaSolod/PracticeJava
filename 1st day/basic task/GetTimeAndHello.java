
import java.time.LocalTime;

public class GetTimeAndHello {
    private static String username = "SpottyPython";

    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        int current = time.getHour();
        if (current >= 0 && current <= 4) {
            System.out.println("Доброй ночи, " + username);
        } else if (current > 4 && current <= 9) {
            System.out.println("Доброе утро, " + username);
        } else if (current > 9 && current <= 16) {
            System.out.println("Добрый день, " + username);
        } else if (current > 16 && current <= 23) {
            System.out.println("Доброй вечер, " + username);
        }
    }
}
