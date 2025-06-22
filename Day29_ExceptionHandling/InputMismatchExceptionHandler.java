// package Day29_ExceptionHandling;
import java.util.Scanner;

public class InputMismatchExceptionHandler {
    public void handle() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            int value = sc.nextInt();
            System.out.println("You entered: " + value);
        } catch (java.util.InputMismatchException e) {
            System.out.println("InputMismatchException: " + e.getMessage());
        }
    }
}
