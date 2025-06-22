import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scan.nextInt();
        scan.nextLine(); // consume the newline

        System.out.print("What's your name? ");
        String name = scan.nextLine();

        try {
            checkAge(age, name);
        } catch (Exception e) {
            System.out.println("A problem occurred: " + e.getMessage());
        }
        scan.close();
    }

    public static void checkAge(int age, String name) throws AgeException {
        if (age < 18) {
            throw new AgeException("You must be 18+ to sign up");
        } else {
            System.out.println(name + ", you are now signed up!");
        }
    }
}