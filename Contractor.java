package com.ualbany.project;

public class Contractor extends Person {
	
	private double fee;
	String startdate,end_date;
	Location L;
	
	

	public Contractor(String firstname, String lastname, String dOB, double fee, String startdate, String end_date,
			Location l) {
		super(firstname, lastname, dOB);
		this.fee = fee;
		this.startdate = startdate;
		this.end_date = end_date;
		L = l;
	}



	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return fee;
	}



	@Override
	public String toString() {
		return "Contractor [fee=" + fee + ", startdate=" + startdate + ", end_date=" + end_date + ", Location=" + L.getAddress()
				+ ", firstname=" + firstname + ", lastname=" + lastname + ", DOB=" + DOB + "]";
	}
	
	
	
	

}
