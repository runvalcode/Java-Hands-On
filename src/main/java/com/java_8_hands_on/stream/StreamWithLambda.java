package com.java_8_hands_on.stream;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamWithLambda {

	public static void main(String[] args) {

		Consumer<Integer> consumer = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println("Stream Print Using Consumer :: " + t);
			}
		};

		// way1 : using foreach using consumer
		Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).forEach(consumer);

		// way2 : using directly passing logic in forEach method
		Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer number) {
				System.out.println("Stream Print Using Direct passing Consumer logic :: " + number);
			}

		});

		// way3.1 : using lambda expression
		Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).forEach((Integer number) -> {
			System.out.println("Stream Print Using Lambda Expression way 1 : " + number);
		});

		// way3.2 : using lambda expression
		Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).forEach(
				(Integer number) -> System.out.println("Stream Print Using Lambda Expression way 2 : " + number));

		// way3.3 : using lambda expression
		Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).forEach(System.out::println);

		// Stream using predicate - declarative programming approach- declarative way of
		// code
		Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).filter(integer -> integer > 5).forEach(System.out::println);
		;

		// imperative programming approach - we actually write whole logic here how to
		// perform filter operation
		Integer[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int number : num) {
			if (number > 5) {
				System.out.println(number);
			}
		}

		System.out.println("----------------------------------------------------------------");
		// order of execution
		Stream<Integer> streamOfNumbers = Arrays.stream(num);

		streamOfNumbers.peek(number -> System.out.println("processing number :: " + number)).filter(number -> {
			System.out.println("checking this number with filter ::" + number);
			return number > 5;
		}).forEach(number -> {
			System.out.println("Printing number from forEach loop");
			System.out.println(number);
		});

		// stream with map operation
		Arrays.stream(num).filter(number -> number > 5).map(number -> {
			switch (number) {
			case 1:
				return "one";
			case 2:
				return "two";
			case 3:
				return "three";
			case 4:
				return "four";
			case 5:
				return "five";
			case 6:
				return "six";
			case 7:
				return "seven";
			case 8:
				return "eight";
			case 9:
				return "nine";
			case 10:
				return "ten";
			default:
				return "number in word not available";
			}
		}).forEach(number -> System.out.println(number));

	}
}
