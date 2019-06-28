package com.ualbany.project;


public class AccountBalance{

	static double balance;
	double add,subtract;
	
	

	public AccountBalance(double balance) {
		super();
		this.balance = balance;
	}
	
	
	public void addBalance(double add)
	{
		balance+=add;
	}
	
	public void removeBalance(double subtract)
	{
		balance-=subtract;
	}


	public double getBalance() {
		return balance;
	}





	public void setBalance(double balance) {
		this.balance = balance;
	}





	@Override
	public String toString() {
		return "AccountBalance [balance=" + balance + "]";
	}
	
}
