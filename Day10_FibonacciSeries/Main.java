package Day10_FibonacciSeries;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FibonacciSeries calculator = new FibonacciSeries();

        System.out.print("Enter the number of terms: ");
        int terms = scanner.nextInt();

        System.out.println("Fibonacci Sequence:");
        for (int i = 0; i < terms; i++) {
            System.out.print(calculator.fib(i) + " ");
        }

        scanner.close();
    }
}
