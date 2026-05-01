/*
 * Question: Write a Java program to find the sum of all elements in an integer array.
 *
 * Input: [10, 20, 30, 40, 50]
 * Output: Sum of array elements: 150
 */
public class SumOfArrayElements {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        // Using an enhanced for loop (for-each loop)
        for (int num : arr) {
            sum += num;
        }

        System.out.println("Sum of array elements: " + sum);
    }
}
