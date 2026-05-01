/*
 * Question: Write a Java program to implement Binary Search on a sorted array.
 *
 * Input: Array = [2, 5, 8, 12, 16, 23, 38, 56, 72, 91], Target = 23
 * Output: Element found at index: 5
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 23;
        
        int low = 0;
        int high = arr.length - 1;
        int index = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                index = mid;
                break;
            }

            if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
