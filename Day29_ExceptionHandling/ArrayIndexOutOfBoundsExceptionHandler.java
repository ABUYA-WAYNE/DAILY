// package Day29_ExceptionHandling;

public class ArrayIndexOutOfBoundsExceptionHandler {
    public void handle() {
        try {
            int[] nums = {1, 2, 3};
            System.out.println(nums[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
