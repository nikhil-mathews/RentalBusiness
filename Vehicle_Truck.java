package com.ualbany.project;

public class Vehicle_Truck extends Vehicle {
	
	int total,available;double rentperday;



	public Vehicle_Truck(String name, String model, String engineNo, int total, int available, double rentperday) {
		super(name, model, engineNo);
		this.total = total;
		this.available = available;
		this.rentperday = rentperday;
	}
	
	public int getAvailable() {
		return available;
	}


	public double getRentperday() {
		return rentperday;
	}


	@Override
	public String toString() {
		return  Name + " [total=" + total + ", available=" + available + ", rentperday=" + rentperday + ",Model=" + Model + ", EngineNo=" + EngineNo + "]";
}


}
