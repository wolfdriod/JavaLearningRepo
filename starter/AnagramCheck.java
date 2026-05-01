import java.util.Arrays;

/*
 * Question: Write a Java program to check if two strings are Anagrams.
 * Two strings are anagrams if they contain the same characters with the same frequencies.
 *
 * Input: "Listen", "Silent"
 * Output: Listen and Silent are Anagrams
 */
public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "Silent";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() == str2.length()) {
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            boolean result = Arrays.equals(charArray1, charArray2);

            if(result) {
                System.out.println(str1 + " and " + str2 + " are Anagrams.");
            } else {
                System.out.println(str1 + " and " + str2 + " are NOT Anagrams.");
            }
        } else {
            System.out.println(str1 + " and " + str2 + " are NOT Anagrams.");
        }
    }
}
