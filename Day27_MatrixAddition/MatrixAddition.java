import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter number of rows: ");
            int rows = scanner.nextInt();
            
            System.out.print("Enter number of columns: ");
            int cols = scanner.nextInt();
            
            int[][] matrix1 = MatrixInput.readMatrix(scanner, rows, cols, "Matrix1");
            int[][] matrix2 = MatrixInput.readMatrix(scanner, rows, cols, "Matrix2");
            
            int[][] result = MatrixOperations.addMatrices(matrix1, matrix2, rows, cols);
            
            System.out.println("Result of Matrix Addition:");
            MatrixOperations.displayMatrix(result);
        }
    }
}
