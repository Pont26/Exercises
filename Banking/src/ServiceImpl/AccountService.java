package ServiceImpl;


import Model.Account;
import Service.AccountInterface;

public class AccountService implements AccountInterface {
    public Account account;


    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            System.out.println("Current balance: " + account.getBalance());
            double newBalance = account.getBalance() + amount;
            account.setBalance(newBalance);
            System.out.println("New balance after deposit: " + account.getBalance());
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && account.getBalance() >= amount) {
            double newBalance = account.getBalance() - amount;
            account.setBalance(newBalance);
            System.out.println("New balance after withdrawal: " + account.getBalance());
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    @Override
    public double viewBalance() {
        return account.getBalance();
    }
}
