package Day6_SwitchCase;

import java.util.Scanner;

public class main {
    public class DayChecker {
        public static void main(String[] args) {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.print("Enter your order number: ");
                int choice = scanner.nextInt();
                
                switch (choice) {
                    case 1:
                        System.out.println("You ordered a burger.");
                        break;
                    case 2:
                        System.out.println("You ordered pizza.");
                        break;
                    case 3:
                        System.out.println("You ordered fries.");
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            }
        }
    }
}
