
public class BankAccount {

    private int balance;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void withdraw(String threadName, int amount) {
        System.out.println(threadName + " is trying to withdraw " + amount + " units");
        try {
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (amount <= balance) {
            System.out.println(threadName + " has enough balance.Proceeding to withdraw...");
            balance -= amount;
            System.out.println(threadName + " completed withdrawal.Remaining balance: " + balance);
        } else {
            System.out.println("Not enough balance for " + threadName + ". Withdrawal cancelled.");
        }

    }

    public void showBalance() {
        System.out.println("Final Account Balance: " + balance);
    }
}
