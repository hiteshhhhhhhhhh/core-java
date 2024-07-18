package com.tsnif.abstractprograms;
import java.util.Scanner;
public class Demo {

	public static final void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the salary of Akash");
	double akashsalary = sc.nextDouble();
		TaxPayer ob = new Akash(akashsalary);
		
		
		
		System.out.println("Enter the salary of Hitesha");
		double hiteshasalary = sc.nextDouble();
			TaxPayer ob1 = new Hitesha(hiteshasalary);

			
			System.out.println("tax akash");
			ob.display();
			
			System.out.println("tax hitesh");
			ob1.display();
			sc.close();
	}

}
