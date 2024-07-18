package com.tsnif.abstractprograms;

public class Akash extends TaxPayer{

	public Akash(double salary) {
		super(salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calTax() {
		// TODO Auto-generated method stub
		if(salary <= 50000) {
			return salary*0.10;
		}
		else 
	       return salary*0.5;
		
}
}