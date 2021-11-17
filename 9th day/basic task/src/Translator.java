import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Translator {
    //не забыть про один одна и два две
    public static final String[] ONES = {"ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
    public static final String[] TENS = {"сто","десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};
    public static final String[] HUNDREDS = {"тысяча", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот"};
    public static final String[] THOUSANDS = {"тысяча", "тысячи", "тысяч"};
    public static final String[] MILLIONS = {"миллион", "миллиона", "миллионов"};
    public static final String[] MILLIARDS = {"миллиард", "миллиарда", "миллиардов"};

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        if (number >= 0  && number < 10) {
            System.out.println(ONES[number]);
        } else if (number >=10 && number < 100){
           int tensRank = number / 10;
           int remains = number % 10;
           String text = TENS[tensRank];
           if (remains != 0){
               text = text + " " + ONES[remains];
           }
            System.out.println(text);
        } else if (number >= 100 && number < 1000){

        }
    }

    public static void getRank(int amountOfNumbers) {
        if (amountOfNumbers == 1) {

        }
    }
}
