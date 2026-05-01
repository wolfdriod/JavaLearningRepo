/*
 * Question: Write a Java program to count the number of vowels and consonants in a given string.
 *
 * Input: "Automation Tester"
 * Output:
 * Vowels: 8
 * Consonants: 8
 */
public class CountVowelsConsonants {
    public static void main(String[] args) {
        String str = "Automation Tester";
        int vowels = 0, consonants = 0;

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); ++i) {
            char ch = str.charAt(i);

            // check if character is any of a, e, i, o, u
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                ++vowels;
            }
            // check if character is in between alphabet a to z
            else if ((ch >= 'a' && ch <= 'z')) {
                ++consonants;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
