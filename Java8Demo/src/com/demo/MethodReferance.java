package com.demo;

import java.util.Arrays;
import java.util.List;

public class MethodReferance {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9);
		/*numbers.stream()
				.map(e->String.valueOf(e))
				.forEach(System.out::println);*/
		
	//with single parameter 
	/*	numbers.stream()
				.map(String::valueOf)
				.forEach(System.out::println);*/
		
	//with two parameter
		/*System.out.println(
				numbers.stream()
				//.reduce(0,(total,e) -> Integer.sum(total, e)));
				.reduce(0,Integer::sum));*/
	// with
		System.out.println(
				numbers.stream()
						.map(String::valueOf)
				.reduce("",(carry,str) -> carry.concat(str)));
				//.reduce("",String::concat));
		
	//parameter as 
	}

}
