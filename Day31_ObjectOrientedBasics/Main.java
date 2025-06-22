
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello, whats your name?");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("your age ?");
        int age = scan.nextInt();
        PersonDemo nn = new PersonDemo(name, age);
        nn.displayInfo();

    }
}
