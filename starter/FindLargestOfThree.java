/*
 * Question: Write a Java program to find the largest of three numbers using nested if-else or if-else-if ladder.
 *
 * Input: num1 = 45, num2 = 89, num3 = 12
 * Output: The largest number is 89
 */
public class FindLargestOfThree {
    public static void main(String[] args) {
        int num1 = 45;
        int num2 = 89;
        int num3 = 12;

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("The largest number is " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("The largest number is " + num2);
        } else {
            System.out.println("The largest number is " + num3);
        }
    }
}
