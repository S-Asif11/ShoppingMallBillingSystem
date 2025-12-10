package com.asif.project;



public class VIPCustomer extends Customer {

	protected double discountRate= 15.0;
	public VIPCustomer(String name) {
		super(name);
	
	}
	public double calculateBill(double... prices) {
	
		
		total = super.calculateBill(prices);
		return total;
	}
	
	public void printDetails() {
		double discount = (total *discountRate)/100;
		double finalAmount = (total - discount);
		
		System.out.println("Customer name: "+this.name);
		System.out.println("amount is  : "+this.total);
		System.out.println("Discount amount is: "+discount);
		System.out.println("Amount after discount "+finalAmount);
	
	}
	
	
	

}
