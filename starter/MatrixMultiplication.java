/*
 * Question: Write a Java program to multiply two matrices.
 *
 * Input:
 * Matrix 1: {{1, 1}, {2, 2}}
 * Matrix 2: {{1, 1}, {2, 2}}
 * Output:
 * Product Matrix:
 * 3 3
 * 6 6
 */
public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] matrix1 = { {1, 1}, {2, 2} };
        int[][] matrix2 = { {1, 1}, {2, 2} };
        
        int r1 = matrix1.length;
        int c1 = matrix1[0].length;
        int c2 = matrix2[0].length;
        
        int[][] product = new int[r1][c2];

        for(int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        System.out.println("Product Matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
    }
}
