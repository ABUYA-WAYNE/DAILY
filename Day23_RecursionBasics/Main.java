package Day23_RecursionBasics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("which number do want to get the factorial for:");
            int input = scanner.nextInt();
            System.out.println(input + "!=" + Recursion.factorial(input));
            System.out.println("Fibonacci of " + input + " is: " + Recursion.fibonacci(input));
        }
    }
}
