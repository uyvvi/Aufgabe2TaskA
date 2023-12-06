package main.java.com.Aufgabe2;

import java.util.Arrays;

public class StringUtility {
    // Schritt 2.1: Methode String reverse(String word)
    public static String reverse(String word) {
        StringBuilder reversed = new StringBuilder(word);
        return reversed.reverse().toString();
    }

    // Schritt 2.2: Methode boolean isPalindrome(String word)
    public static boolean isPalindrome(String word) {
        String reversed = reverse(word);
        return word.equals(reversed);
    }

    // Schritt 2.3: Methode String removeCharacter(String word, int index)
    public static String removeCharacter(String word, int index) {
        return word.substring(0, index) + word.substring(index + 1);
    }

    // Schritt 2.4: Methode boolean isAnagram(String word, String otherWord)
    public static boolean isAnagram(String word, String otherWord) {
        char[] charArray1 = word.toCharArray();
        char[] charArray2 = otherWord.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }

    // Schritt 2.5: Methode String capitalize(String word)
    public static String capitalize(String word) {
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    // Schritt 2.6: Methode int countCharacter(String word, char character)
    public static int countCharacter(String word, char character) {
        int count = 0;
        for (char c : word.toCharArray()) {
            if (c == character) {
                count++;
            }
        }
        return count;
    }
}
