import java.util.HashSet;

public class UserRegistry {

    // HashSet to store unique User objects
    private HashSet<User> users;

    // Constructor to initialize the HashSet
    public UserRegistry() {
        users = new HashSet<>();
    }

    // Method to register a new user
    public void registerUser(String username) {
        User newUser = new User(username); // Create a new User object

        // Try adding the user to the set
        if (users.add(newUser)) {
            // If successful, user was added (not a duplicate)
            System.out.println("User '" + username + "' registered successfully.");
        } else {
            // If not added, it was a duplicate
            System.out.println("Username '" + username + "' already taken.");
        }
    }

    // Method to show all users in the registry
    public void showAllUsers() {
        // If there are users in the set
        if (!users.isEmpty()) {
            System.out.println("Registered Users:");
            // Print each user one by one
            for (User user : users) {
                System.out.println("- " + user);
            }
        } else {
            // No users found
            System.out.println("No users registered yet.");
        }
    }

    // Method to remove a user by username
    public void remove(String userName) {
        User userToRemove = new User(userName); // Create a temporary User to match

        // Try to remove the user
        if (users.remove(userToRemove)) {
            System.out.println("User '" + userName + "' was removed.");
        } else {
            System.out.println("User '" + userName + "' not found.");
        }
    }

    // Method to check if a user exists
    public boolean check(Object o) {
        // Ensure the object is a string (username)
        if (o instanceof String) {
            // Return true if the user is in the set
            return users.contains(new User((String) o));
        }
        // If input is invalid, return false
        return false;
    }
}
