package com.tns.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ArrayList ob = new ArrayList();
		 * System.out.println("the size of arraylist"+ob.size()); ob.add(2); ob.add(7);
		 * ob.add(22.3); System.out.println("the elements of array are"+ob);
		 * System.out.println(("check the elements")+ob.contains(22.3));
		 * System.out.println("remove the specificied element"+ob.remove(1));
		 * System.out.println(("check the elements")+ob);
		 */
	
	ArrayList <String>ob = new ArrayList<String>();
	ob.add("banglore");
	ob.add("mysore");
	ob.add("mandya");
	ob.add("chanapatna");
	System.out.println("elemenets in array are"+ob);
	Collections.sort(ob);
	System.out.println("elemenets in array are"+ob);
	Iterator<String> i = ob.iterator();
	while(i.hasNext()){
		String nm = i.next();
		//ob.remove(0);
		System.out.println(nm);
	}
	
	
	}
	
}
