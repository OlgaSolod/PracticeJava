
import java.time.LocalTime;
import java.util.HashMap;

public class GetTimeAndHello extends TimeOfDay {
    private static String username = "SpottyPython";

    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        int current = time.getHour();
        sayGoodNight(current,username);
        sayGoodMorning(current,username);
        sayGoodAfternoon(current,username);
        sayGoodEvening(current,username);
    }
}
