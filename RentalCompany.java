package com.ualbany.project;

import java.util.ArrayList;

public class RentalCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccountBalance B= new AccountBalance(15000.21);
		
		
		Vehicle_Car Accord= new Vehicle_Car("Accord","Model 4","2ff234",12,5,59.99 );
		Vehicle_Car Civic= new Vehicle_Car("Civic","III","32qv7h8",10,8,39.99 );
		Vehicle_Car KiaRio= new Vehicle_Car("Kia Rio","43r","qwgef76",1,1,79.99 );
		Vehicle_Car Versa= new Vehicle_Car("Nissan Versa","II","164568456",13,10,69.99 );		
		Vehicle_SUV Rogue= new Vehicle_SUV("Nissan Rogue","IV","654646",5,0,54.99);
		Vehicle_SUV Jeep= new Vehicle_SUV("Jeep Grand Cherokee","II","asdf4sg",7,7,99.99);
		Vehicle_SUV Explorer= new Vehicle_SUV("Ford Explorer","e","avfvgf5",4,1,94.99);
		Vehicle_SUV Wrangler= new Vehicle_SUV("Jeep Wrangler","V","6asd4646",5,3,89.99);
		Vehicle_Truck LUV = new Vehicle_Truck("1979 Chevrolet LUV","79","awef54",3,0,199.00);
		Vehicle_Truck Xtracab = new Vehicle_Truck("1989 Toyota Truck Xtracab SR5","89","iojj5546486",7,5,299.00);
		Vehicle_Truck Dodge = new Vehicle_Truck("1994 Dodge Ram","94","iubhyb34t534",9,5,149.99);
		Vehicle_Truck Blazer = new Vehicle_Truck("1995 Chevrolet Blazer","95","564189649",8,4,136.99);
		
		
		ArrayList<Vehicle> All_Vehicles = new ArrayList<Vehicle>(); All_Vehicles.add(Accord);All_Vehicles.add(Civic);
		All_Vehicles.add(KiaRio); All_Vehicles.add(Versa);All_Vehicles.add(Rogue);All_Vehicles.add(Jeep);
		All_Vehicles.add(Explorer);All_Vehicles.add(Wrangler);All_Vehicles.add(LUV);All_Vehicles.add(Xtracab);
		All_Vehicles.add(Dodge);All_Vehicles.add(Blazer);
		
		System.out.println("All vehicles have been added to the database All_Vehicles\n");
		//for(Vehicle v: All_Vehicles)	System.out.println( v );
		//System.out.println( All_Vehicles );
		
		
		
		ArrayList<Customer> All_Customers = new ArrayList<Customer>();
		
		Customer c1=new Customer("HATT","POLOS","01/02/1988");
		System.out.println( "\n\nCustomer " +c1.firstname+ " wants an Accord\n"+Accord.toString()+" " );
		All_Customers.add(c1);System.out.println( "Customer " +c1.firstname+ " has been added to the database: All Customers" );
		if(Accord.getAvailable()>0) {CustomerInvoice inv = new CustomerInvoice(c1,10,Accord.getRentperday(),Accord,Location.MIAMI);
		System.out.println( " "+inv.toString()+" " );	B.addBalance(inv.totalcost);System.out.println( "New "+B.toString()+" " );}
		else System.out.println( " Unavailable " );
		//System.out.println( " "+Accord.toString()+" " );
		
		Customer c2=new Customer("JO","GESSY","11/02/1965");
		System.out.println( "\n\nCustomer " +c2.firstname+ " wants a KiaRio\n"+KiaRio.toString()+" " );
		All_Customers.add(c2);System.out.println( "Customer " +c2.firstname+ " has been added to the database: All Customers" );
		if(KiaRio.getAvailable()>0) {CustomerInvoice inv = new CustomerInvoice(c2,5,KiaRio.getRentperday(),KiaRio,Location.OHIO);
		System.out.println( " "+inv.toString()+" " );	B.addBalance(inv.totalcost);System.out.println( "New "+B.toString()+" " );}
		else System.out.println( "Sorry - Unavailable \n" );
		
		Customer c3=new Customer("BERNARD","CHICHEPORTICHE","01/02/1980");	
		System.out.println( "\n\nCustomer " +c3.firstname+ " wants a KiaRio\n"+KiaRio.toString()+" " );
		All_Customers.add(c3);System.out.println( "Customer " +c3.firstname+ " has been added to the database: All Customers" );
				if(KiaRio.getAvailable()>0) {CustomerInvoice inv = new CustomerInvoice(c3,15,KiaRio.getRentperday(),KiaRio,Location.OHIO);
		System.out.println( " "+inv.toString()+" " );	B.addBalance(inv.totalcost);System.out.println( "New "+B.toString()+" " );}
		else System.out.println( "Sorry - Unavailable \n" );
		
		
		Customer c4=new Customer("BLANCHE","CHICHEPORTICHE","2/02/1981");
		System.out.println( "\n\nCustomer " +c4.firstname+ " wants a LUV\n"+LUV.toString()+" " );
		All_Customers.add(c4);System.out.println( "Customer " +c4.firstname+ " has been added to the database: All Customers" );
				if(LUV.getAvailable()>0) {CustomerInvoice inv = new CustomerInvoice(c4,4,LUV.getRentperday(),LUV,Location.SAN_JOSE);
		System.out.println( " "+inv.toString()+" " );	B.addBalance(inv.totalcost);System.out.println( "New "+B.toString()+" " );}
		else System.out.println( "Sorry - Unavailable \n" );
		
				
		Customer c5=new Customer("JULIE","PARTOUCHE","13/03/1975");
		System.out.println( "\n\nCustomer " +c5.firstname+ " wants a Explorer\n"+Explorer.toString()+" " );
		All_Customers.add(c5);System.out.println( "Customer " +c5.firstname+ " has been added to the database: All Customers" );
				if(Explorer.getAvailable()>0) {CustomerInvoice inv = new CustomerInvoice(c5,5,Explorer.getRentperday(),Explorer,Location.MIAMI);
		System.out.println( " "+inv.toString()+" " );	B.addBalance(inv.totalcost);System.out.println( "New "+B.toString()+" " );}
		else System.out.println( "Sorry - Unavailable \n" );
		
				
		Customer c6=new Customer("ZAKIA","CHEMLA","18/01/1997");
		System.out.println( "\n\nCustomer " +c6.firstname+ " wants a Blazer\n"+Blazer.toString()+" " );
		All_Customers.add(c6);System.out.println( "Customer " +c6.firstname+ " has been added to the database: All Customers" );
				if(Blazer.getAvailable()>0) {CustomerInvoice inv = new CustomerInvoice(c6,12,Blazer.getRentperday(),Blazer,Location.OHIO);
		System.out.println( " "+inv.toString()+" " );	B.addBalance(inv.totalcost);System.out.println( "New "+B.toString()+" " );}
		else System.out.println( "Sorry - Unavailable \n" );
		
		
	System.out.println( "\n\nLoading information on employees and contractors. They will be added to the database: All_Employees\n\n" );
				ArrayList<Person> All_Employees = new ArrayList<Person>();
				
				SalariedEmployee[] SalariedEmployees= new SalariedEmployee[3];
				SalariedEmployees[0]=new SalariedEmployee("EMP","NO1","10/22/1985",550.00,Location.AUSTIN);
				SalariedEmployees[1]=new SalariedEmployee("EMP","NO2","11/09/1990",450.00,Location.MIAMI);
				SalariedEmployees[2]=new SalariedEmployee("EMP","NO3","05/21/1989",850.00,Location.OHIO);
	for(int i=0;i<3;i++) 
		{
		All_Employees.add(SalariedEmployees[i]);	
		SalarySlip se = new SalarySlip(SalariedEmployees[i],65.23,32.14);
		System.out.println( " "+se.toString()+" " ); B.removeBalance(se.netsalary);
		System.out.println( " "+B.toString()+" " );
		
		}

		Contractor[] Contractors= new Contractor[3];
		
		System.out.println( "Hiring a contractor..." );
		Contractors[0]=new Contractor("Contr", "NO1", "13/09/1985", 1899.99, "13/03/1999", "13/03/2022", Location.SAN_JOSE);
		System.out.println(Contractors[0]);
		B.removeBalance(Contractors[0].getPaymentAmount());System.out.println( " "+B.toString()+" " );
		
		System.out.println( "Hiring another contractor..." );
		Contractors[1]=new Contractor("Contr", "NO2", "21/03/1975", 1699.99, "13/03/1999", "13/03/2022", Location.AUSTIN);
		System.out.println(Contractors[1]);
		B.removeBalance(Contractors[1].getPaymentAmount());System.out.println( " "+B.toString()+" " );
		
		System.out.println( "Hiring another contractor..." );
		Contractors[2]=new Contractor("Contr", "NO3", "03/12/1990", 2099.99, "13/03/1999", "13/03/2022", Location.MIAMI);
		System.out.println(Contractors[2]);
		B.removeBalance(Contractors[2].getPaymentAmount());System.out.println( " "+B.toString()+" " );
		
		
		for(int i=0;i<3;i++) 	All_Employees.add(Contractors[i]);
		
	
	
	}

}
