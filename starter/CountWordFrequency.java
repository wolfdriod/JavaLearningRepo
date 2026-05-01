/*
 * Question: Write a Java program to count the frequency of a specific character in a String.
 *
 * Input: String = "Automation Testing", Character = 't'
 * Output: Frequency of 't' is: 3
 */
public class CountWordFrequency {
    public static void main(String[] args) {
        String str = "Automation Testing";
        char ch = 't';
        int count = 0;

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        System.out.println("Frequency of '" + ch + "' is: " + count);
    }
}
