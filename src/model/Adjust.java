package model;

public class Adjust {
	private String account;
	private String counterAccount;
	private double amount;
	
	//constructor
	public Adjust(String account, String counterAccount, double amount) {
		super();
		this.account = account;
		this.counterAccount = counterAccount;
		this.amount = amount;
	}
	
	//getters and setters
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getCounterAccount() {
		return counterAccount;
	}
	public void setCounterAccount(String counterAccount) {
		this.counterAccount = counterAccount;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
}
