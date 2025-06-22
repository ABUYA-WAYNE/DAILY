// package Day29_ExceptionHandling;
public class NumberFormatExceptionHandler {
    public void handle() {
        try {
            int num = Integer.parseInt("Wayne");
            System.out.println("Parsed number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        }
    }
}
