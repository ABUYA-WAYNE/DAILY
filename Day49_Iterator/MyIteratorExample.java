import java.util.ArrayList;
import java.util.Iterator;

public class MyIteratorExample {
    public void run() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Daniel");

        Iterator<String> iterator = names.iterator(); // Create an iterator for the list

        System.out.println("Iterating through list:");
        while (iterator.hasNext()) { // Check if another element exists
            String name = iterator.next(); // Move to next element
            System.out.println(name);

            // Optional: Remove name if it starts with 'C'
            if (name.startsWith("C")) {
                iterator.remove(); // Safe removal during iteration
                System.out.println(name + " was removed.");
            }
        }

        System.out.println("\nUpdated list:");
        System.out.println(names); // Shows list after removal
    }
}
