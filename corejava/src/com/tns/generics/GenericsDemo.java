package com.tns.generics;

public class GenericsDemo {
	public static void main(String[] args) {
	Generics<String>stringobj = new Generics();
	stringobj.setData("hello");
	System.out.println("The string object"+stringobj.getData());
	
	
	
	Generics<Integer>intobj = new Generics();
	intobj.setData(2);
	intobj.setData(1);
	System.out.println("The integer object"+intobj.getData());
	
	
	Generics<Double>doubleobj = new Generics();
	doubleobj.setData(23.19);
	doubleobj.setData(78.58);
	System.out.println("The double object"+doubleobj.getData());

}
}