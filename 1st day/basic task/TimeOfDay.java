public class TimeOfDay {
    public static void sayGoodNight(int current, String username){
        if (current >= 0 && current <= 4) {
            System.out.println("Доброй ночи, " + username);
        }
    }

    public static void sayGoodMorning(int current, String username){
        if (current > 4 && current <= 9) {
            System.out.println("Доброе утро, " + username);
        }
    }

    public static void sayGoodAfternoon(int current, String username){
        if (current > 0 && current <= 16) {
            System.out.println("Добрый день, " + username);
        }
    }

    public static void sayGoodEvening(int current, String username){
        if (current > 16 && current <= 23) {
            System.out.println("Доброй вечер, " + username);
        }
    }
}
