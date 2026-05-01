/*
 * Question: Write a Java program to calculate the sum of first N natural numbers using a while loop.
 *
 * Input: 10
 * Output: The sum of first 10 natural numbers is 55
 */
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int limit = 10;
        int sum = 0;
        int i = 1;

        while (i <= limit) {
            sum += i;
            i++;
        }

        System.out.println("The sum of first " + limit + " natural numbers is " + sum);
    }
}
