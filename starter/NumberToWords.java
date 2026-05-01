/*
 * Question: Write a Java program to convert a single-digit number to its word format.
 * (Can be expanded to more digits, but starting simple)
 *
 * Input: 5
 * Output: Five
 */
public class NumberToWords {
    public static void main(String[] args) {
        int num = 5;
        String word = "";

        switch (num) {
            case 0: word = "Zero"; break;
            case 1: word = "One"; break;
            case 2: word = "Two"; break;
            case 3: word = "Three"; break;
            case 4: word = "Four"; break;
            case 5: word = "Five"; break;
            case 6: word = "Six"; break;
            case 7: word = "Seven"; break;
            case 8: word = "Eight"; break;
            case 9: word = "Nine"; break;
            default: word = "Number out of range (0-9)";
        }

        System.out.println(num + " in words is: " + word);
    }
}
