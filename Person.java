package com.ualbany.project;

public abstract class Person implements Payable {
	
	String firstname,lastname,DOB;
	
	

	public Person(String firstname, String lastname, String dOB) {
		this.firstname = firstname;
		this.lastname = lastname;
		DOB = dOB;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", lastname=" + lastname + ", DOB=" + DOB + "]";
	}
	
	
	

}
