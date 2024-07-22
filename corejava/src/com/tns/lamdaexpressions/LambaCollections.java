package com.tns.lamdaexpressions;

import java.util.ArrayList;

public class LambaCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>li = new ArrayList<>();
		li.add(22);
		li.add(34);
		li.add(44);
		li.forEach(e->System.out.println(e));

	}

}
