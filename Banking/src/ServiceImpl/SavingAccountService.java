package ServiceImpl;

import Model.Account;
import Model.SavingAccount;

public class SavingAccountService extends AccountService {
    private SavingAccount savingAccount;


    public SavingAccountService(SavingAccount savingAccount) {
        this.savingAccount = savingAccount; 
        this.account = savingAccount;
        }

    public double calculateInterest() {
        double interest = savingAccount.getBalance() * (savingAccount.getInterestRate() / 100);
        return interest;
    }

    @Override
    public void withdraw(double amount) {
        double newBalance = savingAccount.getBalance() - amount;
        if (newBalance >= savingAccount.getminBalance()) {
            savingAccount.setBalance(newBalance);
        } else {
            System.out.println("Invalid amount. Cannot withdraw below minimum balance.");
        }
    }
}
