/*
 * Question: Write a Java program to print a right-angled triangle star pattern.
 *
 * Input: 5 (rows)
 * Output:
 * *
 * **
 * ***
 * ****
 * *****
 */
public class PrintStarPattern {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
