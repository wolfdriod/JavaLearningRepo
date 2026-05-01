/*
 * Question: Write a Java program to swap two numbers without using a third/temporary variable.
 *
 * Input: a = 10, b = 20
 * Output: 
 * Before Swap: a = 10, b = 20
 * After Swap: a = 20, b = 10
 */
public class SwapNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before Swap: a = " + a + ", b = " + b);

        // Logic to swap without third variable
        a = a + b; // a becomes 30
        b = a - b; // b becomes 30 - 20 = 10
        a = a - b; // a becomes 30 - 10 = 20

        System.out.println("After Swap: a = " + a + ", b = " + b);
    }
}
