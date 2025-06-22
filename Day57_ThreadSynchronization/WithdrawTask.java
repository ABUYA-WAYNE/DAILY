
public class WithdrawTask extends Thread {

    private BankAccount account;
    private int amountToWithdraw;

    public WithdrawTask(BankAccount account, int amount, String threadName) {
        super(threadName);
        this.account = account;
        this.amountToWithdraw = amount;
    }

    public void run() {
        account.withdraw(getName(), amountToWithdraw);
    }
}
