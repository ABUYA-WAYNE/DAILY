import java.util.Optional;

public class User {
    private String username;
    private String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public Optional<String> getEmailOptional() {
        return Optional.ofNullable(email);
    }
}
