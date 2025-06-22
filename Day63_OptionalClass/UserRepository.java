
import java.util.*;

public class UserRepository {

    private Map<String, User> users = new HashMap<>();

    public UserRepository() {
        // Simulate a database
        users.put("john", new User("john", "john@example.com"));
        users.put("mary", new User("mary", null)); // Missing email
    }

    public Optional<User> findByUsername(String username) {
        return Optional.ofNullable(users.get(username));
    }
}
