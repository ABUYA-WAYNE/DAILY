// File: Main.java
package Day25_PrimeChecker;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input the number: ");
            int input = scanner.nextInt();
            System.out.println(input + " is prime? " + PrimeChecker.prime(input));
        }
    }
}
