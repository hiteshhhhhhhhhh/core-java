package com.tns.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student>ar = new ArrayList<Student>();
		ar.add(new Student(222,"a","banglore"));
		ar.add(new Student(223,"b","mysore"));
		ar.add(new Student(224,"c","mandya"));
		
		
		System.out.println("--------------------------");
		Collections.sort(ar,new SortName());
		for(int i = 0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		

	}

}
