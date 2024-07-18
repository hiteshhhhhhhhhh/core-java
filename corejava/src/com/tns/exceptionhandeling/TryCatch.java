// program to demonstrate try multiple  catch
package com.tns.exceptionhandeling;

public class TryCatch {
	public static void divide() {
	int a=6 ,b=4,c; 
	try {
		 c=a/b; }// exception raised	
	catch(ArithmeticException e){
		System.out.println("exception caught"+e.getMessage());
		}
		
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println("exception caught"+e.getMessage());
	}
	catch(Exception e) {
		System.out.println("exeption caught"+e.getMessage());
	}
	
	
}
}