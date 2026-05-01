/*
 * Question: Write a Java program to check if a number is an Armstrong number.
 * An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself.
 *
 * Input: 153
 * Output: 153 is an Armstrong number.
 */
public class ArmstrongNumberCheck {
    public static void main(String[] args) {
        int number = 153;
        int originalNumber = number;
        int result = 0;

        while (originalNumber != 0) {
            int remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if (result == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
