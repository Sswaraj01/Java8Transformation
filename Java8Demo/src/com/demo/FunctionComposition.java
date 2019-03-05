package com.demo;

import java.util.Arrays;
import java.util.List;

public class FunctionComposition {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		//Function Composition
		/*System.out.println(
		numbers.stream()
			   .filter(e-> e%2==0)
			   .map(e->e*2)
			   .reduce(0,Integer::sum)
				);*/
		
		//Function Composition
				System.out.println(
				numbers.stream()
					   .filter(e-> e%2==0)
					   .mapToInt(e->e*2)
					   .sum());
	}

}
