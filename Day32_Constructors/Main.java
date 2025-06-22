import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create object using default constructor
        Work rand = new Work();
        rand.displayInfo();

        // Get user input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter task: ");
        String task = scan.nextLine();

        System.out.print("Enter hours: ");
        int hours = scan.nextInt();

        // Create object using parameterized constructor
        Work special = new Work(task, hours);
        special.displayInfo();

        scan.close();
    }
}
