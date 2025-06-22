// package Day29_ExceptionHandling;

public class ArithmeticExceptionHandler {
    public void handle() {
        try {
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
    }
}
