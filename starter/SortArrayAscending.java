/*
 * Question: Write a Java program to sort an array in ascending order using Bubble Sort.
 *
 * Input: [5, 2, 8, 7, 1]
 * Output: Sorted Array: [1, 2, 5, 7, 8]
 */
public class SortArrayAscending {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 7, 1};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.print("Sorted Array: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i == arr.length - 1 ? "" : ", "));
        }
        System.out.println("]");
    }
}
