package com.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Java8Lamda {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9);

		//External Iterator
		/*for(int i=0;i<numbers.size();i++){
			System.out.println(numbers.get(i));
		}*/

		//External iterator
		/*for(Integer i:numbers){
			System.out.println(i);
		}*/

		//internal Iterator
		/*numbers.forEach(new Consumer<Integer>() {
			public void accept(Integer t) {
				System.out.println(t);
			}
		});*/

		//internal Iterator
		//numbers.forEach((Integer t) ->System.out.println(t));
		
		//Java 8 has type inference,finally hold your tweet,but only for lamda  Expression.
		//numbers.forEach((t) ->System.out.println(t));
		
		//Parenthesis is optional, but only for one parameters lamdas.
		//numbers.forEach(t ->System.out.println(t));
		
		//Instead of that we can use method reference because it is not a good idea to just pass a value instead of doing something.
		numbers.forEach(System.out::println);
		
		//Lamda expression should be glue code.
		//Two lines may be too many.
		
		
		
	}

}
