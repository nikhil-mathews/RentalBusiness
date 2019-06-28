package com.ualbany.project;

public class SalariedEmployee extends Person {
	
	
	private double salary;
	Location L;
	
	public double getSalary() {
		return salary;
	}



	public SalariedEmployee(String firstname, String lastname, String dOB, double salary, Location L) {
		super(firstname, lastname, dOB);
		this.salary=salary; this.L=L;
		// TODO Auto-generated constructor stub
	}


	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return salary;
	}



	@Override
	public String toString() {
		return "SalariedEmployee [salary=" + salary + ", Location=" + L.getAddress() + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", DOB=" + DOB + "]";
	}




	
	
}
