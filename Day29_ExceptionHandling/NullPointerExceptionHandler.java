// package Day29_ExceptionHandling;
public class NullPointerExceptionHandler {
    public void handle() {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }
    }
}
