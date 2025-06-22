public class FactorialRecursion {

    // Recursive method to calculate factorial
    public static long factorial(int n) {
        if (n == 0 || n == 1) { // Base case: factorial of 0 or 1 is 1
            return 1;
        }
        return n * factorial(n - 1); // Recursive case
    }

    public static void main(String[] args) {
        int number = 5; // You can change this number to test others
        long result = factorial(number); // Call the recursive method
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
