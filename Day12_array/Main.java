package Day12_array;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Size of the array?");
        int n = scanner.nextInt();
        int sum = 0;
        int[] numbers = new int[n]; // array has a fixed size
        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            int y = scanner.nextInt();
            sum += y;
            numbers[i] = y; // Assign input directly to array index
        }

        System.out.println("You entered: " + Arrays.toString(numbers));
        System.out.println("the sum is: " + sum);
        scanner.close();
    }
}
