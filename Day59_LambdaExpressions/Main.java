public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Lambda for addition
        MyMathOperation add = (x, y) -> x + y;

        // Lambda for subtraction
        MyMathOperation subtract = (x, y) -> x - y;

        // Lambda for multiplication
        MyMathOperation multiply = (x, y) -> x * y;

        // Lambda for division with zero-check
        MyMathOperation divide = (x, y) -> y != 0 ? x / y : 0;

        // Call calculate() with different lambdas
        System.out.println("Add: " + calculator.calculate(10, 5, add));
        System.out.println("Subtract: " + calculator.calculate(10, 5, subtract));
        System.out.println("Multiply: " + calculator.calculate(10, 5, multiply));
        System.out.println("Divide: " + calculator.calculate(10, 5, divide));
    }
}
