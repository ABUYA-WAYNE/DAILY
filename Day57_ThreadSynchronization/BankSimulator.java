
public class BankSimulator {

    public static void main(String[] args) {
        BankAccount sharedAccount = new BankAccount(100);
        WithdrawTask t1 = new WithdrawTask(sharedAccount, 70, "alice");
        WithdrawTask t2 = new WithdrawTask(sharedAccount, 70, "bob");
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sharedAccount.showBalance();
    }
}
