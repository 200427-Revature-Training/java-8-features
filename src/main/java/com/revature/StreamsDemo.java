package com.revature;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Streams - Allow stream consumption of data, meant to be a functional, immutable style
 * 			for processing large streams of data.  Can be made parallel easily by starting or 
 * 			converting to a parallelStream
 * 
 * Lambdas - Lambda functions are new in Java 8.  Lambdas can implement any functional interface.
 * 
 * Method Reference - Implicitly creates a lambda expression where the argument is implicitly passed
 * 			as parameters to referenced method.
 *
 *
 * Major Functional Interfaces of Java 8
 * 
 * Consumer - accepts an argument, returns void
 * Function - Accepts an argument, returns a value
 * Predicate - Accepts an argument, returns a boolean
 * Supplier - Accepts no arguments, returns a value
 * 
 * 
 */
public class StreamsDemo {
	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<>();
		
		Consumer<Integer> consumer;
		
		
		ints.add(1);
		ints.add(5);
		ints.add(9);
		ints.add(2);
		ints.add(7);
		ints.add(3);
		ints.add(4);
		ints.add(6);
		
		ints.stream()
			.filter((Integer i) -> i % 2 == 0)
			.map((i) -> i * 3)
//			.forEach(i -> System.out.println(i)) - the parameter is simply passed to a function
			.forEach(System.out::println);
	}
}
