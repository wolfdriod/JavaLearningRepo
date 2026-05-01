/*
 * Question: Write a Java program to print the multiplication table of a given number using a for loop.
 *
 * Input: 5
 * Output:
 * 5 * 1 = 5
 * 5 * 2 = 10
 * ...
 * 5 * 10 = 50
 */
public class PrintMultiplicationTable {
    public static void main(String[] args) {
        int num = 5;

        System.out.println("Multiplication Table of " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}
