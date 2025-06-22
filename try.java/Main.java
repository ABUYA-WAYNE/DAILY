import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        try (Scanner scanner = new Scanner(System.in)) {

            // Ask user for matrix dimensions
            System.out.print("Enter number of rows: ");
            int rows = scanner.nextInt();

            System.out.print("Enter number of columns: ");
            int columns = scanner.nextInt();

            // Create the 2D array
            int[][] matrix = new int[rows][columns];

            // Input elements into the matrix
            System.out.println("Enter elements of the matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print("Element at [" + i + "][" + j + "]: ");
                    matrix[i][j] = scanner.nextInt();
                }
            }

            // Display the matrix
            System.out.println("\nMatrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println(); // Move to next row
            }
        }
    }
}
