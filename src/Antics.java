/**
 *Description: Homework 7a
 * This program is designed to convert Yen to USD & USD to Yen.
 *@author Michael Polk
 *@author Kwame Puryear
 *@since March 05 2025
 */

public class Antics {

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Test isPalindrome method
        System.out.println("Is 'Abba' a palindrome? " + isPalindrome("Abba")); // true
        System.out.println("Is 'Hello' a palindrome? " + isPalindrome("Hello")); // false

        // Test isAbecedarian method
        System.out.println("Is 'almost' an abecedarian? " + isAbecedarian("almost")); // true
        System.out.println("Is 'apple' an abecedarian? " + isAbecedarian("apple")); // false
    }

    /**
     * Checks if a given string is a palindrome.
     * A palindrome reads the same backward as forward, ignoring case.
     *
     * @param str The string to check.
     * @return true if the string is a palindrome, false otherwise.
     */
    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        String normalizedStr = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String reversedStr = new StringBuilder(normalizedStr).reverse().toString();
        return normalizedStr.equals(reversedStr);
    }

    /**
     * Checks if a given string is abecedarian.
     * An abecedarian word has its letters arranged in alphabetical order, ignoring case.
     *
     * @param str The string to check.
     * @return true if the string is abecedarian, false otherwise.
     */
    public static boolean isAbecedarian(String str) {
        if (str == null) {
            return false;
        }
        String normalizedStr = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        for (int i = 1; i < normalizedStr.length(); i++) {
            if (normalizedStr.charAt(i) < normalizedStr.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }
}