package main.java.com.Aufgabe2;

public class main {

    public static void main(String[] args) {
        // Beispielcode zum Testen der StringUtils-Methoden
        String original = "hallo";
        String reversed = StringUtility.reverse(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);

        boolean isPalindrome = StringUtility.isPalindrome("level");
        System.out.println("Ist 'level' ein palindrome? " + isPalindrome);

        String withoutCharacter = StringUtility.removeCharacter("world", 1);
        System.out.println("Ohne Buchstabe 1: " + withoutCharacter);

        boolean isAnagram = StringUtility.isAnagram("listen", "silent");
        System.out.println("Sind 'listen' und 'silent' anagrams? " + isAnagram);

        String capitalized = StringUtility.capitalize("cat");
        System.out.println("Capitalized: " + capitalized);

        int characterCount = StringUtility.countCharacter("hallo", 'l');
        System.out.println("Anzahl 'l' in 'hallo': " + characterCount);


    }
}
