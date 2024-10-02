package ServiceImpl;

import Model.Account;
import Model.CurrentAccount;

public class CurrentAccountService extends AccountService {
	private CurrentAccount currentAccount;


    public CurrentAccountService(CurrentAccount currentAccount) {
        this.currentAccount = currentAccount;
        this.account = currentAccount;
    }

    @Override
    public void withdraw(double amount) {
        double totalAvailableBalance = currentAccount.getBalance() + currentAccount.getExtraLimit();
        if (amount > 0 && totalAvailableBalance >= amount) {
            double newBalance = currentAccount.getBalance() - amount;
            currentAccount.setBalance(newBalance);
            System.out.println("New balance after withdrawal: " + currentAccount.getBalance());
        } else {
            System.out.println("Withdrawal amount  is invalid.");
        }
    }
}
