package Day4_SimpleCalculator;

public class Main {
    public static void main(String[] args) {
        // Create a new calculator object
        Calculator calculator = new Calculator();

        // Perform some calculations
        System.out.println("Addition: " + calculator.add(5, 3));
        System.out.println("Subtraction: " + calculator.subtract(5, 3));
        System.out.println("Multiplication: " + calculator.multiply(5, 3));
        System.out.println("Division: " + calculator.divide(5, 3));
    }
}
