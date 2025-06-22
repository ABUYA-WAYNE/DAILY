package Day9_FactorialProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 20: ");
        int n = scanner.nextInt();
        if (n < 0 || n > 20) {
            System.out.println("follow instructions");
        } else {
            long factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println(n + "! = " + factorial);
        }

        scanner.close();
    }
}
