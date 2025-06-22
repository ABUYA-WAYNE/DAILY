import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            // Reading input for the second Intern
            System.out.print("Enter name: ");
            String name = scan.nextLine();

            System.out.print("Enter ID: ");
            int id = scan.nextInt();

            System.out.print("Enter salary: ");
            int salary = scan.nextInt();

            // Creating object with default constructor
            Intern l = new Intern();

            // Creating object with parameterized constructor
            Intern h = new Intern(name, id, salary);

            // Displaying info from both objects
            System.out.println("\n--- Default Intern ---");
            l.displayInfo();

            System.out.println("\n--- Custom Intern ---");
            h.displayInfo();
        }
        
    }
}
