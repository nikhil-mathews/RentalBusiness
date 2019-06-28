package com.ualbany.project;

public abstract class Receipt implements Payable {

	AccountBalance B;
	
	

	public double getB() {
		return B.balance;
	}

	public void setB(Double b) {
		B.balance = b;
	}

	public void Deduct(double amount) {
	 B.balance-=amount;}
	 
	 public void Add(double amount) {
		 B.balance+=amount;
				
	}
	
	

}
