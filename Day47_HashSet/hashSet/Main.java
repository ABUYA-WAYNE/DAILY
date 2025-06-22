import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create a new instance of UserRegistry to manage user operations
        UserRegistry registry = new UserRegistry();

        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Menu loop flag
        boolean running = true;

        // Loop to keep the program running until the user exits
        while (running) {
            // Display the menu options
            System.out.println("\n--- User Registry Menu ---");
            System.out.println("1. Register user");
            System.out.println("2. Check user");
            System.out.println("3. Remove user");
            System.out.println("4. Show all users");
            System.out.println("5. Exit");
            System.out.print("Choose an option (1-5): ");

            // Read user choice
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            // Switch case to handle the user's choice
            switch (choice) {
                case 1:
                    // Register a new user
                    System.out.print("Enter username to register: ");
                    String newUsername = scanner.nextLine();
                    registry.registerUser(newUsername);
                    break;
                case 2:
                    // Check if a user exists
                    System.out.print("Enter username to check: ");
                    String checkUsername = scanner.nextLine();
                    boolean exists = registry.check(checkUsername);
                    System.out.println("User '" + checkUsername + "' exists: " + exists);
                    break;
                case 3:
                    // Remove a user
                    System.out.print("Enter username to remove: ");
                    String removeUsername = scanner.nextLine();
                    registry.remove(removeUsername);
                    break;
                case 4:
                    // Show all registered users
                    registry.showAllUsers();
                    break;
                case 5:
                    // Exit the program
                    System.out.println("Exiting program...");
                    running = false;
                    break;
                default:
                    // Handle invalid input
                    System.out.println("Invalid option. Please try again.");
            }
        }

        // Close the scanner to avoid memory leaks
        scanner.close();
    }
}
