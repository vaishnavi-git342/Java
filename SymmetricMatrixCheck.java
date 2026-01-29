import java.util.Scanner;

public class SymmetricMatrixCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read size of the matrix
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Symmetric matrix must be square
        if (rows != cols) {
            System.out.println("A symmetric matrix must be square!");
            sc.close();
            return;
        }

        int[][] matrix = new int[rows][cols];

        // Input matrix
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("matrix[" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // Check for symmetry
        boolean isSymmetric = true;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    isSymmetric = false;
                    break;
                }
            }
            if (!isSymmetric) break;
        }

        // Print result
        if (isSymmetric) {
            System.out.println("\nThe matrix is symmetric.");
        } else {
            System.out.println("\nThe matrix is NOT symmetric.");
        }

        sc.close();
    }
}
