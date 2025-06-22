
public class LoginManager {
    private UserRepository repo;
    private final EmailService emailService;

    public LoginManager(UserRepository repo, EmailService emailService) {
        this.repo = repo;
        this.emailService = emailService;
    }

    public void login(String username) {
        repo.findByUsername(username).ifPresentOrElse(user -> {
            System.out.println("✅ Logged in: " + user.getUsername());

            user.getEmailOptional().ifPresentOrElse(
                email -> emailService.sendWelcomeEmail(email),
                () -> System.out.println("⚠️ Email missing for: " + user.getUsername())
            );

        }, () -> {
            System.out.println("❌ Login failed. User not found.");
        });
    }
}
