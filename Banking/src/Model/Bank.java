package Model;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	private String bankName;
	private List<Account> accounts;
	
	public Bank(String bankName) {
		this.bankName = bankName;
		this.accounts = new ArrayList<>();
	}

	public void addAccount(Account account) {
		this.accounts.add(account);
	}
	
	@Override
	public String toString() {
		return "Bank: " + this.bankName + " \n Account Name: " + this.accounts;
	}
}
