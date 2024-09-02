package tns.com.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamOperations {
	public static void main(System[] args) {
		Integer [] values = new Integer[] {1,2,3,4,5};
		Stream<Integer> stream = Arrays.stream(values);
		
		
		// map function
		System.out.println("square of a number is"+Arrays.toString(values));
		stream.map(num->num*num).forEach (System.out::println);
	
	
	}

}
