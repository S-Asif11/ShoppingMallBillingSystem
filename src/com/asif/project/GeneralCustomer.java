package com.asif.project;





public class GeneralCustomer extends Customer {
	
	public GeneralCustomer(String name) {
		super(name);
	}
	
	public double calculateBill(double... prices) {
		
		total = super.calculateBill(prices);
		return total;
	}
	
	public void printDetails() {
		
		
		System.out.println("Customer name: "+this.name);
		System.out.println("amount is  : "+this.total);
		System.out.println("No discount for GENERAL Customer");
		System.out.println("So Final Amount is "+total);
	
	}

}
