// program to demonstrate abstract class
package com.tsnif.abstractprograms;
// non concrete class
public abstract class TaxPayer {
	protected double salary;
	public TaxPayer(double salary) { // para constructor
		super();
		this.salary = salary;
	}
	public abstract double calTax(); // abstract method
	public void display() {
		System.out.println("The tax paid is " +calTax());
		
	}
	
	

}
