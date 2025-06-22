package Day11_Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Size of the array?");
        int n = scanner.nextInt();

        int[] numbers = new int[n]; // array has a fixed size
        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt(); // Assign input directly to array index
        }

        System.out.println("You entered: " + Arrays.toString(numbers));

        scanner.close();
    }
}
