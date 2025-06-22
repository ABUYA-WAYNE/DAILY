public class Main {
    public static void main(String[] args) {
        UserRepository repo = new UserRepository();
        EmailService emailService = new EmailService();
        LoginManager manager = new LoginManager(repo, emailService);

        manager.login("john"); // Found, has email
        manager.login("mary"); // Found, no email
        manager.login("jake"); // Not found
    }
}
