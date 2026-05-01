/*
 * Question: Write a Java program to implement Linear Search. Find the index of a target element in an array.
 *
 * Input: Array = [10, 50, 30, 70, 80, 20, 90, 40], Target = 30
 * Output: Element found at index: 2
 */
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10, 50, 30, 70, 80, 20, 90, 40};
        int target = 30;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
