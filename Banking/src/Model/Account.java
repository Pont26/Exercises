package Model;

public class Account {
	private String accountNumber;
	private double balance;
	private Bank bank;

	
	public  Account(String accountNumber, double balance,Bank bank) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.bank = bank;
		this.bank.addAccount(this);
	}

	public String getAccountNumber() {
		return accountNumber;
	}
	
	public double  getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Bank getBank() {
		return bank;
	}
	
	@Override
	public String toString() {
		return "Account Number: " + this.accountNumber ;
	}


	

}
