/*
 * Question: Write a Java program to calculate the average of elements in an array.
 *
 * Input: [10, 20, 30, 40, 50]
 * Output: Average is: 30.0
 */
public class CalculateAverage {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        double average = (double) sum / arr.length;
        System.out.println("Average is: " + average);
    }
}
