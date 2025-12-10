package com.asif.project;



public class Customer {
	
	protected String name;
	protected double total;
	
	public Customer(String name) {
		
		if(name == null || name.isBlank()) {
			System.out.println("Enter a valid name");
			System.exit(0);
			
		}
		
		this.name = name;
				
	}
	
	public double calculateBill(double... prices) {
		
		for(double price : prices) {
			total = total + price;
		}
		return total;
	}
	
	public void printDetails() {
		System.out.println("Customer name: "+this.name);
		System.out.println("price is : "+this.total);
		System.out.println("No discount for general customer");
	
	}
	
	

}
