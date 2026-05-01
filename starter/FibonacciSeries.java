/*
 * Question: Write a Java program to print the Fibonacci series up to N terms.
 * The Fibonacci sequence is a series of numbers where a number is the addition of the last two numbers, starting with 0, and 1.
 *
 * Input: 10
 * Output: Fibonacci Series: 0 1 1 2 3 5 8 13 21 34
 */
public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10;
        int firstTerm = 0;
        int secondTerm = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + " ");

            // compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        System.out.println();
    }
}
