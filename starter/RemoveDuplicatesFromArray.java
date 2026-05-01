import java.util.Arrays;

/*
 * Question: Write a Java program to remove duplicate elements from a sorted array.
 *
 * Input: [1, 2, 2, 3, 4, 4, 5]
 * Output: Array after removing duplicates: [1, 2, 3, 4, 5]
 */
public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int n = arr.length;

        if (n == 0 || n == 1) {
            System.out.println("Array after removing duplicates: " + Arrays.toString(arr));
            return;
        }

        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[n - 1];

        System.out.print("Array after removing duplicates: [");
        for (int i = 0; i < j; i++) {
            System.out.print(arr[i] + (i == j - 1 ? "" : ", "));
        }
        System.out.println("]");
    }
}
