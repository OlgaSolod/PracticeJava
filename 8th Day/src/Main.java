import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;


public class Main {
    static Deque<Integer> digits = new LinkedList<>();

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int digit;
        boolean isEnterEnd = false;
        while (!isEnterEnd) {
            try {
                System.out.println("Введите число.");
                digit = Integer.parseInt(reader.readLine());
                add(digit);
                System.out.println("Ввод закончен?");
                if (reader.readLine().equals("Y") || reader.readLine().equals("y")) {
                    isEnterEnd = true;
                }
            } catch (Exception e) {
                System.out.println("Введено не число");
            }
        }
        System.out.println(digits);
        getFirst();
        System.out.println(digits);
        getLast();
        System.out.println(digits);
        getLast();
    }

    //Добавляем элемент в очередь
    private static void add(int digit) {
        digits.add(digit);
    }

    // получаем первый элемент из очереди
    private static int getFirst() {
        int first;
        if (digits.peek() == null) throw new NullPointerException("NULL");
        first = digits.poll();
        return first;
    }

    // получаем последний элемент из очереди
    private static int getLast() {
        if (digits.peek() == null) throw new NullPointerException("NULL");
        return digits.pollLast();
    }
}
