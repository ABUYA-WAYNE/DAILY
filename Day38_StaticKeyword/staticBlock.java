
public class staticBlock {
    static int data;
    static {
        data = 8;
        System.out.println("static block has been executed ");
    }

    static void method() {
        System.out.println("data value is: " + data);
    }
}
