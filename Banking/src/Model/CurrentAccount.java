package Model;

public class CurrentAccount extends Account{
	
	private double extraLimit;
	
	
	public CurrentAccount(String accountNumber, double balance, Bank bank,double extraLimit) {
		super(accountNumber, balance, bank);
		this.extraLimit = extraLimit;
	}
	
	public double getExtraLimit() {
		return extraLimit;
	}
	
	public void setExtraLimit(double extraLimit) {
		this.extraLimit = extraLimit;
	}


	
	

}
