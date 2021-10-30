import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class EncryptDecrypt {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputString = reader.readLine();

        String stringForEncryption = toEncrypt(inputString);
        String stringForDecryption = toDecrypt(stringForEncryption);
        reader.close();
        System.out.println(stringForEncryption);
        System.out.println(stringForDecryption);
    }

    //создаем метод для шифрования введенной строки
    public static String toEncrypt(String inputString) {
        //создаем мапу, содержащую в себе условия проверки вводимой строки
        String str = "abcdefghijklmnopqrstuvwxyz";
        char[] chars = str.toCharArray();
        HashMap<Character, Character> alphabet = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != 'z') {
                alphabet.put(chars[i], chars[i + 1]);
            } else {
                alphabet.put('z', 'a');
            }
        }
        //переводим введенную строку в массив символово
        char[] charsToEncrypt = inputString.toCharArray();
        //строка, в которой будем собирать зашифрованные символы обратно в строку
        StringBuilder encryptionString = new StringBuilder();
        for (char c : charsToEncrypt
        ) {
            if (alphabet.containsKey(c)) {
                encryptionString.append(Character.toUpperCase(alphabet.get(c)));

            } else if (Character.isUpperCase(c)) {
                char transferChar = Character.toLowerCase(c);
                encryptionString.append(alphabet.get(transferChar));
            } else {
                encryptionString.append(" ");
            }
        }
        return encryptionString.toString();
    }

    //создаем метод для дешифрования ранее зашифрованной строки
    public static String toDecrypt(String stringForEncryption) {
        String str = "abcdefghijklmnopqrstuvwxyz";
        char[] chars = str.toCharArray();
        HashMap<Character, Character> alphabet = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != 'a') {
                alphabet.put(chars[i], chars[i - 1]);
            } else {
                alphabet.put('a', 'z');
            }
        }
        char[] charsToDecrypt = stringForEncryption.toCharArray();
        StringBuilder decryptionString = new StringBuilder();
        for (char c : charsToDecrypt
        ) {
            if (alphabet.containsKey(c)) {
                decryptionString.append(Character.toUpperCase(alphabet.get((c))));
            } else if (Character.isUpperCase(c)) {
                char transferChar = Character.toLowerCase(c);
                decryptionString.append(alphabet.get(transferChar));
            } else {
                decryptionString.append(" ");
            }
        }
        return decryptionString.toString();
    }
}
