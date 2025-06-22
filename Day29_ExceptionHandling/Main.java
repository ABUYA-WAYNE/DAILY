
public class Main {
  public static void main(String[] args) {
        handleArithmetic();
        handleArrayIndex();
        handleNullPointer();
        handleNumberFormat();
        handleInputMismatch();
    }

    static void handleArithmetic() {
        try {
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
    }

    static void handleArrayIndex() {
        try {
            int[] nums = {1, 2, 3};
            System.out.println(nums[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    static void handleNullPointer() {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }
    }

    static void handleNumberFormat() {
        try {
            int num = Integer.parseInt("Wayne");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        }
    }

    static void handleInputMismatch() {
        try {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.print("Enter an integer: ");
            int value = sc.nextInt(); // Type-sensitive
        } catch (java.util.InputMismatchException e) {
            System.out.println("InputMismatchException: " + e.getMessage());
        }
    }
}


