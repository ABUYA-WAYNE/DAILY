
public class Main {

    public static void main(String[] args) {
        Greeter sayHello = (name) -> System.out.println("Hello," + name);
        sayHello.greet("Achieng");
    }
}
