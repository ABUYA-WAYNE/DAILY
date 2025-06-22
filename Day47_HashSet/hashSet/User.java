import java.util.Objects;

public class User {
    private String username; // Store the username

    // Constructor to initialize the user
    public User(String username) {
        this.username = username;
    }

    // Getter for the username
    public String getUsername() {
        return username;
    }

    // Override hashCode to ensure HashSet can group similar usernames
    @Override
    public int hashCode() {
        return Objects.hash(username); // Generate hash based on username
    }

    // Override equals to compare usernames logically
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Same reference
        if (obj == null || getClass() != obj.getClass()) return false; // Different class

        User other = (User) obj;
        return Objects.equals(this.username, other.username); // Compare actual usernames
    }

    // Return the username as the string representation of the object
    @Override
    public String toString() {
        return username;
    }
}
