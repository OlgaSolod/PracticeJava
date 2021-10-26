public class StringSeparator {
    static void getStringLength(String inputString) {
        System.out.println("Количество символов в строке: " + inputString.length());
    }

    static void getSymbolsWithoutSpace(String inputString) {
        int countSymbolsWithoutSpace = 0;
        char[] charArray = inputString.toCharArray();
        for (char c : charArray) {
            if (!(c == ' ')) {
                countSymbolsWithoutSpace++;
            }
        }
        System.out.println("Количество символов в строке без пробелов: " + countSymbolsWithoutSpace);
    }

    static void getStringOddOrOddness(String inputString) {
        if (inputString.length() % 2 == 0) {
            System.out.println("Количество символов в тексте четное");
        } else {
            System.out.println("Количество символов в тексте нечетное");
        }
    }

    static void compareStringLengthToMaxLength(String inputString, int maxLength) {
        if (inputString.length() > maxLength) {
            System.out.println("Длина текста превышает длину " + maxLength + " символов");
        }
    }
}
