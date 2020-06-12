package com.revature;

import java.util.Optional;
import java.util.function.Supplier;
/**
 * One of the challenges of working with Java is that any object type could hold the value of
 * null. Optional is a container class that can could optionally contain a value or may
 * contain null.  Optional is useful because it explicitly makes it clear to consumers of your
 * functions that your function may return a null value and they must provide handling logic.
 *
 *
 * * Default methods in interfaces
 * * LocalDate - entire .time package is new in Java 8, replacing java.util.Date
 * 		java.time - LocalDate, LocalTime, LocalDateTime, Instance, Duration, Period, EpochTime, ...
 */
public class OptionalDemo {

	static int myInt;
	static Supplier<Optional<Integer>> optionalProducer = () -> {
		double value = Math.random();
		Integer intValue = (int) (value*100);
		return intValue % 2 == 0 ? Optional.of(intValue) : Optional.empty();
	};
	
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			Optional<Integer> optionalInt = optionalProducer.get();
			if(optionalInt.isPresent()) {
				System.out.println(optionalInt.get());
			}
		}
	}
	
	
}

