package com.tns.staticprgms;

public class Myclass {

	private int section;
	static int srNO;
	
	static {
		System.out.println("---static block---");
		srNO=1000;

	}

	public Myclass() {
		super();
		System.out.println("default cons");
		
	}
	static void display() {
		System.out.println("static method");
		System.out.println("serial no is "+  srNO++);
		
		
	}
	@Override
	public String toString() {
		return "Myclass [serialno=" + srNO + " section="+ section+"]";
	}
	

}
