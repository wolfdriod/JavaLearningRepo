/*
 * Question: Write a Java program to find the factorial of a given number using a for loop.
 *
 * Input: 5
 * Output: Factorial of 5 is 120
 */
public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        long factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + num + " is " + factorial);
    }
}
