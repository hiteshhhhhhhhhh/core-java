// program to demonstarte interface
package com.tns.interfaceprograms;

public interface Amazon {
	void welcome();
	void thankyou();  //abstract methods
	
	 static int PriceOfProduct() {
			int amt = 350;
			System.out.println("The product price in amazon is "+amt);
			return amt;
	}
	static void aboutUs() {
		System.out.println("It's a ecommerce website");
	}

}
