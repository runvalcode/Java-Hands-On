package com.java_8_hands_on.stream;

import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class StreamIterate {
	public static void main(String[] args) {

		Stream.iterate(1, new UnaryOperator<Integer>() {
			@Override
			public Integer apply(Integer integer) {
				return integer + 1;
			}
		})
		.skip(5)
		.filter(integer -> integer < 35)
		.map(integer -> integer * integer)
	    .limit(30)
		.forEach(System.out::println);

	}
}
