package com.ualbany.project;

public class Customer extends Person {

	public Customer(String firstname, String lastname, String dOB) {
		super(firstname, lastname, dOB); 
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Customer [firstname=" + firstname + ", lastname=" + lastname + ", DOB=" + DOB + "]";
	}

	
	
	

	
}
