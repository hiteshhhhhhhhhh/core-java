package com.tns.interfaceprograms;

public class offers implements Amazon , Flipkart{

	@Override
	public void welcome() {
		// TODO Auto-generated method stub
		System.out.println("welcome to the website");
	}

	@Override
	public void thankyou() {
		// TODO Auto-generated method stub
		System.out.println("bye bye, thankyou");
		
	}
	public void bestOffer() {
		//static method from amazon
		Amazon.aboutUs();
		int amazon = Amazon.PriceOfProduct();
		//static method form flipkart
		Flipkart.aboutUs();
		int flipkart = Flipkart.PriceOfProduct();
		
		//comparing the prices of product of from amazon and flipkart
		if ( amazon < flipkart) {
			System.out.println("the best offers is from amazon: "+amazon);
		}
		else {
			System.out.println("the best offers is from flipkart: "+flipkart);
		}
	}	

}
