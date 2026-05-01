/*
 * Question: Write a Java program to check whether a given number is Prime or not.
 * A prime number is a number that is greater than 1 and divided by 1 or itself only.
 *
 * Input: 29
 * Output: 29 is a Prime Number
 */
public class CheckPrimeNumber {
    public static void main(String[] args) {
        int num = 29;
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is NOT a Prime Number");
        }
    }
}
