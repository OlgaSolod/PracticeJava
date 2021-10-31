import java.util.ArrayList;

public class DividerArrays {
    public static void main(String[] args) {
        String[] wordArray = {"orange apple", "banana", "kiwi strawberry blueberry", "      кот cj,frf собака ", "  "};
        divider(wordArray);
    }

    public static void divider(String[] array) {
        ArrayList<String> newWordArray = new ArrayList<>();
        for (String s : array
        ) {
            String[] str = s.split("\s");
            for (String word : str
            ) {
                if (!word.isEmpty()) {
                    newWordArray.add(word);
                }
            }
        }
        for (String s : newWordArray
        ) {
            System.out.println(s);
        }
    }
}
