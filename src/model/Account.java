package model;

public class Account {

	private String name;
	private double amount;
	
	public Account(String name,double amount) {
		this.name = name;
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAmount() {
		return String.valueOf(amount);
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}
