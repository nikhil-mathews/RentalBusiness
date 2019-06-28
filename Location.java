package com.ualbany.project;

public enum Location {
	AUSTIN("1815 Trinity St, Austin, TX 78712"),
	OHIO("1759 North High Street, Columbus, Ohio 43210."),
	SAN_JOSE("North Garage. 421 E San Fernando St. San Jose, CA 95112"),
	MIAMI("210 7th St Miami Beach, FL 33139");
	
	private final String Address;
	
	Location(String Address)
	{this.Address=Address;}

	public String getAddress() {
		return Address;
	}
	
	
}
