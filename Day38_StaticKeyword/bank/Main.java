package bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("How many accounts to create? ");
            int acs = scan.nextInt();
             String s = (acs > 1) ? "s " : " ";
            scan.nextLine(); // consume newline

            // ✅ Changed from String[][] to BankAccount[] to hold object references
            BankAccount[] accounts = new BankAccount[acs];

            // ✅ Directly storing account input into BankAccount objects
            for (int index = 0; index < acs; index++) {
                System.out.println("Creating account number " + (index + 1));
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Balance: ");
                double balance = Double.parseDouble(scan.nextLine());
                System.out.print("Password: ");
                String password = scan.nextLine();
                accounts[index] = new BankAccount(name, (int) balance, password);
                System.out.println("Account" + s + "created successfully!\n");
            }

            // login logic with two attempts max
            System.out.println("Enter account name to login: ");
            String loginName = scan.nextLine();
            BankAccount loggedInAccount = null;
            loginName = loginName.trim(); // remove extra spaces
            for (BankAccount acc : accounts) {
                if (acc.getHolder().equalsIgnoreCase(loginName.trim())) {
                    System.out.println("Account found");
                    loggedInAccount = acc;
                    break;
                }
            }

            if (loggedInAccount == null) {
                System.out.println("Account not found!!");
                return;
            }

            int attempts = 0;
            boolean success = false;
            while (attempts < 2) {
                System.out.print("Enter password: ");
                String passInput = scan.nextLine();
                if (loggedInAccount.checkPassword(passInput)) {
                    System.out.println("Login success 🧡");
                    success = true;
                    break;
                } else {
                    attempts++;
                    System.out.println("Wrong password, " + (2 - attempts) + " attempts remaining!!");
                }
            }

            if (!success) {
                System.out.println("TOO MANY ATTEMPTS \nACCOUNT HAS BEEN BLOCKED");
                // ✅ Fixed incorrect method name (was: blockedAccount())
                loggedInAccount.blockAccount();
                return;
            }

            while (true) {
                System.out.println("\nChoose operation:");
                System.out.println("1. Check balance (costs 0.005%)");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Delete account (balance < 2)");
                System.out.println("5. Logout");

                int choice = scan.nextInt();
                scan.nextLine(); // consume newline
                switch (choice) {
                    case 1 -> loggedInAccount.checkBalance();
                    case 2 -> {
                        System.out.print("Amount to deposit: ");
                        double dep = scan.nextDouble();
                        scan.nextLine(); // ✅ Prevent scanner issue after nextDouble
                        loggedInAccount.deposit(dep);
                    }
                    case 3 -> {
                        System.out.print("Amount to withdraw: ");
                        double wth = scan.nextDouble();
                        scan.nextLine(); // ✅ Prevent scanner issue after nextDouble
                        loggedInAccount.withdraw(wth);
                    }
                    case 4 -> {
                        if (loggedInAccount.canDelete()) {
                            System.out.println("Account deleted.");
                            loggedInAccount.blockAccount(); // ✅ Corrected method call
                            return;
                        } else {
                            System.out.println("Empty the account first!!");
                            // ✅ Added missing break to prevent fallthrough
                        }
                    }
                    case 5 -> {
                        System.out.println("Logged out");
                        return;
                    }
                    default -> System.out.println("INVALID INPUT!!");
                }
            }
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
