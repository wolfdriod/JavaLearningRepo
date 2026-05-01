/*
 * Question: Write a Java program to add two matrices (2D arrays).
 *
 * Input: 
 * Matrix 1: {{1, 2}, {3, 4}}
 * Matrix 2: {{5, 6}, {7, 8}}
 * Output:
 * Sum Matrix:
 * 6 8
 * 10 12
 */
public class MatrixAddition {
    public static void main(String[] args) {
        int[][] matrix1 = { {1, 2}, {3, 4} };
        int[][] matrix2 = { {5, 6}, {7, 8} };
        
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        
        int[][] sum = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Sum Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
