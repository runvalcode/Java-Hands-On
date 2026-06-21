package com.java_8_hands_on.stream;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamGenerate {

	public static void main(String[] args) {

		Supplier<String> supplier = new Supplier<String>() {

			@Override
			public String get() {
				return "Hello Stream! ";
			}
		};
		
		
		Supplier<String> lambdaSupplier = () ->{ return "Hello Stream! "; };

		Consumer<String> consumer = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println("Printing The String From Stream ::: "+t);
			}
		};
		
		
		Consumer<String> lambdaConsumer = t -> System.out.println("Printing The String From Stream using lambda consumer ::: "+t);
		
		Stream<String> streamOfStrings = Stream.generate(supplier);
		streamOfStrings.forEach(consumer);
	}
}
