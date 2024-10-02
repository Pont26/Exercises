package Model;

public class SavingAccount extends Account{
   private	double interestRate;
	private double minBalance;
	
	 public SavingAccount(String accountNumber, double balance, Bank bank, double interestRate, double minBalance) {
	    super(accountNumber, balance, bank);
		this.interestRate = interestRate;
		this.minBalance = minBalance;
		
	}
	 public double getInterestRate() {
	 return interestRate;
	 }
	 
	 public double getminBalance() {
		 return minBalance;
	 }

}
