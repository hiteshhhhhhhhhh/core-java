package com.tsnif.abstractprograms;

public class Hitesha extends TaxPayer  {

	public Hitesha(double salary) {
		super(salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calTax() {
		// TODO Auto-generated method stub
		if(salary <= 50000) {
			return salary*0.15;
		}
		else 
			return salary*0.7;
		
	
	}
}
	


