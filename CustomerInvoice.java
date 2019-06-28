package com.ualbany.project;

public class CustomerInvoice extends Receipt {

	
	private Customer Custm;
	int days,i=0; double costperday,totalcost=0.0;
	Vehicle_Car car;Vehicle_Truck Truck;Vehicle_SUV SUV; Vehicle v;
	Location Pickup_location;
		
	


	public CustomerInvoice(Customer custm, int days, double cost, Vehicle_Car car,Location Pickup_location) {	/////////
		super();i=1;
		Custm = custm;
		this.days = days;
		this.costperday = cost;
		this.car = car;
		this.Pickup_location=Pickup_location;
		car.available--;
	}
	
	public CustomerInvoice(Customer custm, int days, double cost, Vehicle_Truck Truck,Location Pickup_location) {	/////////
		super();i=2;
		Custm = custm;
		this.days = days;
		this.costperday = cost;
		this.Truck = Truck;
		this.Pickup_location=Pickup_location;
		Truck.available--;
	}
	
	public CustomerInvoice(Customer custm, int days, double cost, Vehicle_SUV SUV,Location Pickup_location) {	/////////
		super();i=3;
		Custm = custm;
		this.days = days;
		this.costperday = cost;
		this.SUV = SUV;
		this.Pickup_location=Pickup_location;
		SUV.available--;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	
	public double costforrentingcar() {		///////////////
	switch(i)	
	{	case 1: totalcost=car.rentperday*days; v=car;break;
	case 2: totalcost=Truck.rentperday*days; v=Truck;break;	
	case 3: totalcost=SUV.rentperday*days; v=SUV;break;
		
	}
		return totalcost;
	}


	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return totalcost;
	}

	@Override
	public String toString() {
		return "CustomerInvoice [Custm=" + Custm + ", days=" + days + ", costperday=" + costperday + ", totalcost="
				+ costforrentingcar() + ", Vehicle=" + v + ", Pickup_location=" + Pickup_location.getAddress() + "]";
	}


	
	
}
