package Main;


import Model.Bank;
import Model.CurrentAccount;
import Model.SavingAccount;
import ServiceImpl.CurrentAccountService;
import ServiceImpl.SavingAccountService;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("KBZ Bank");

        SavingAccount savingAccount = new SavingAccount("01", 800000, bank, 5, 3000);
        SavingAccountService savingAccountService = new SavingAccountService(savingAccount);
        savingAccountService.deposit(50000);
        savingAccountService.withdraw(700000000);
        
        double interest = savingAccountService.calculateInterest();
        System.out.println("Balance after interest calculation: " + (savingAccount.getBalance() + interest));
        
        CurrentAccount currentAccount =new CurrentAccount("2", 1000, bank,5000);
        CurrentAccountService currentAccountService=new CurrentAccountService(currentAccount);
        currentAccountService.deposit(1000);
        currentAccountService.withdraw(500);
        
        
    }
}
