package com.ualbany.project;

public class SalarySlip extends Receipt {
	
		private SalariedEmployee se;
		double incentives, deductions,netsalary;
		
		

	
	public SalarySlip(SalariedEmployee se, double incentives, double deductions) {
			super();
			this.se = se;
			this.incentives = incentives;
			this.deductions = deductions;
			netsalary=se.getSalary()+incentives-deductions;
		}


	@Override
	public double getPaymentAmount() {
		Deduct(se.getSalary());
		// TODO Auto-generated method stub
		return se.getSalary();
	}


	@Override
	public String toString() {
		return "SalarySlip [se=" + se + ", incentives=" + incentives + ", deductions=" + deductions + ", netsalary="
				+ netsalary + "]";
	}




}
