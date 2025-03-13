/**
 *Description: Group Project 2 - To test and anaylze text
 * This program is designed to test:
 * - whether a word or phrase is a Palindrome & isAbecederian
 * - test if a sentence is a pangram
 * - capitalizeFirstLetter - of a string
 *
 *@author Michael Polk (isPalindrome and isAbecederian)
 *@author Kwame Puryear (isPangram and capitalizeFirstLetter)
 *@since March 06 2025
 */

public class Antics {

    public static void main(String[] args) {

        welcome();

        // Test isPalindrome method
        System.out.println("Is 'Now, sir a war is won!' a palindrome? " + isPalindrome("Now, sir a war is won!")); // should return true
        System.out.println("Is 'How about now?' a palindrome? " + isPalindrome("How about now?")); // false

        // Test isAbecedarian method
        System.out.println("Is 'Ghost' an abecedarian? " + isAbecedarian("Ghost")); //should return true
        System.out.println("Is 'Hero is the best' an abecedarian? " + isAbecedarian("Hero is the best")); //should return false

        // Test isPangram method
        System.out.println(isPangram("The quick brown fox jumps over the lazy dog"));  // true
        System.out.println(isPangram("We do what we do"));  // false

        // Test capitalizeFirstLetter method
        System.out.println(capitalizeFirstLetter("michael Polk"));  // "Michael Polk"
        System.out.println(capitalizeFirstLetter("kwame Puryear"));  // "Kwame Puryear"
        System.out.println(capitalizeFirstLetter(""));  // ""
    }

    /**
     * a welcome message explaining what the programs function is.
     */
    public static void welcome() {
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Welcome to the Antics program!");
        System.out.println("This program checks if a word is a palindrome or an abecedarian as well as isPangram or capitalizeFirstLetter.");
        System.out.println("Simply call the methods provided in the program.");
        System.out.println("I hope you have fun using our program  & it fits your purposes!");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
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

    /**
     * Checks if a given string is a pangram.
     * @param str the input string
     * @return true if the string is a pangram, otherwise false
     */
    public static boolean isPangram(String str) {
        // Convert the string to lowercase to handle case-insensitivity
        str = str.toLowerCase();

        // Iterate over all lower case letters of the alphabet
        for (char i = 'a'; i <= 'z'; i++) {
            // If any letter is not found in the string, return false
            if (str.indexOf(i) == -1) {
                return false;
            }
        }
        // If all letters are found, return true
        return true;
    }

    /**
     * Capitalize the first letter of a given string.
     * @param str The input string.
     * @return The input string with its first letter capitalized.
     */
    public static String capitalizeFirstLetter(String str) {
        // Check if the string is empty
        if (str.isEmpty()) {
            return str;
        }
        // Capitalize the first letter and concatenate the rest of the string
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}