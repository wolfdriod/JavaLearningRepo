/*
 * Question: Write a Java program to check if a given String is a Palindrome or not.
 * A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward.
 *
 * Input: "radar"
 * Output: radar is a Palindrome
 * 
 * Input: "automation"
 * Output: automation is NOT a Palindrome
 */
public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "radar";
        String reversedStr = "";

        int strLength = str.length();

        for (int i = (strLength - 1); i >= 0; --i) {
            reversedStr = reversedStr + str.charAt(i);
        }

        if (str.toLowerCase().equals(reversedStr.toLowerCase())) {
            System.out.println(str + " is a Palindrome");
        } else {
            System.out.println(str + " is NOT a Palindrome");
        }
    }
}
