package com.tnsif.testing;

import org.junit.Test;
import org.junit.jupiter.api.Assumptions;

public class AssumptionDemo {	
	@Test
	public void testAssumption() {
		int a=5 , s=25;
		Assumptions.assumeFalse(s!=a*a);
		System.out.println("will it dispaly");
	}
	
	
	@Test
	public void testAssumption1() {
		int a=5 , b=6;
		Assumptions.assumingThat(a!=b,()->System.out.println("will it be displayed"));
		
		
	}

}
