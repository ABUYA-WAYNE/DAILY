// File: PrimeChecker.java
package Day25_PrimeChecker;

public class PrimeChecker {

    public static boolean prime(int input) {
        if (input<= 1) return false;
        if (input == 2) return true;
        if (input% 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(input); i += 2) {
            if (input % i == 0) return false;
        }
        return true;
    }
}
