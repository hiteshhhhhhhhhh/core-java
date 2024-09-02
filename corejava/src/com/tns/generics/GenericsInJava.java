package com.tns.generics;

import java.util.ArrayList;

public class GenericsInJava<T> {
	public static void main(String[] args) {
//		ArrayList list = new ArrayList();
//		list.add("java");
//		list.add("123");
		ArrayList<String> list=new ArrayList<String>();
		for(Object object :list) {
			String str = (String) object;
			System.out.println(str);
		}
		
	}

}
