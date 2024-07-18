package com.tns.interfaceprograms;

public class Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//interface object
		Amazon ob = new offers(); //can use flipkart also...
		
		//object of class Offers
		offers offer = new offers();
		
		//welcome message inherited from the interfaces
		ob.welcome();
		//calculating the best offer in the offers class
		offer.bestOffer();
		//thank you message inherited from the interfaces
		ob.thankyou();
	}

}
