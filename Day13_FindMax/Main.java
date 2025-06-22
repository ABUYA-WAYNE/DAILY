package Day13_FindMax;

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
        int max = numbers[0];
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            int y = scanner.nextInt();
            sum += y;
            numbers[i] = y; // Assign input directly to array index
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("You entered: " + Arrays.toString(numbers));
        System.out.println("the sum is: " + sum);
        System.out.println("Maximum number is: " + max);
        scanner.close();
    }
}
