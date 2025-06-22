public class Main {
    public static void main(String[] args) {
        Method m = new Method();

        // Adding entries
        m.add("Alice", 90);
        m.add("Bob", 85);

        // Retrieve a value
        m.retrieve("Alice");

        // Print size
        m.size();

        // Check if empty
        System.out.println("Is empty: " + m.checkIfEmpty());

        // Remove a key
        m.remove("Bob");

        // Show keys and values
        m.keySet();
        m.getValues();

        // Clear the map
        m.clear();

        // Check again if empty
        System.out.println("Is empty: " + m.checkIfEmpty());
    }
}
