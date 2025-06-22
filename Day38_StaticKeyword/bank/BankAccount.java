package bank;

public class BankAccount {
    private final String holder;
    private double balance;
    private String password;
    private boolean blocked = false;

    static final double interestRates = 0.05;
    static final double balanceCheckCost = 0.0005;

    // ✅ Constructor now accepts double instead of int
    public BankAccount(String holder, double balance, String password) {
        this.holder = holder;
        this.balance = balance;
        this.password = password;
    }

    public boolean checkPassword(String input) {
        return !blocked && this.password.equals(input);
    }

    // ✅ Correct method name to match usage
    public void blockAccount() {
        blocked = true;
    }

    public boolean isBlocked() {
        return blocked;
    }

    // ✅ Changed to double for consistency
    public double calcInterest(double balance) {
        return balance * interestRates;
    }

    public double getBalance() {
        return balance;
    }

    public void identity() {
        System.out.println("Name: " + holder + "\nBalance: " + balance);
    }

    public void checkBalance() {
        if (blocked) {
            System.out.println("Account is blocked");
            return;
        }
        // ✅ Corrected balance check logic to deduct cost, not overwrite balance
        double cost = balance * balanceCheckCost;
        balance -= cost;
        System.out.printf("Balance after %.5f%% check cost: %.2f%n", balanceCheckCost * 100, balance);
    }

    public void deposit(double amount) {
        if (blocked) {
            System.out.println("Account is blocked!");
            return;
        }
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (blocked) {
            System.out.println("Account is blocked!");
            return;
        }
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid or insufficient funds.");
        }
    }

    public boolean canDelete() {
        return balance < 2;
    }

    public String getHolder() {
        return holder;
    }
}
