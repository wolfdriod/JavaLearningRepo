/*
 * Question: Write a Java program to find the maximum and minimum elements in an array.
 *
 * Input: [34, 12, 89, 5, 45]
 * Output: 
 * Maximum element: 89
 * Minimum element: 5
 */
public class FindMaxMinInArray {
    public static void main(String[] args) {
        int[] arr = {34, 12, 89, 5, 45};
        
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}
