package com.tns.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
	
	public static void main(String[] args) {
		List<Laptop>laps = new ArrayList<Laptop>();
		laps.add(new Laptop("Dell",55000,12));
		laps.add(new Laptop("HP",34000,7));
		laps.add(new Laptop("Apple",78877,9));
		Collections.sort(laps);
		for(Laptop l :laps) {
	
			System.out.println(l);
		}
		
	}
}
