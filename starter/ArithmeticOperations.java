/*
 * Question: Write a Java program to perform basic arithmetic operations (addition, subtraction, multiplication, division, modulo) on two numbers.
 *
 * Input: 20, 5 (Hardcoded)
 * Output:
 * Addition: 25
 * Subtraction: 15
 * Multiplication: 100
 * Division: 4
 * Modulo: 0
 */
public class ArithmeticOperations {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 5;

        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
        System.out.println("Modulo: " + (num1 % num2));
    }
}
