package com.java_8_hands_on.stream;

import java.util.stream.Stream;

public class StreamShortCircuitOperation {

    public static void main(String[] args) {

        Stream<Integer> numbers = Stream.of(10, 90, 80, 54, 33, 24, 123, 1);
        Stream<Integer> sortedInteger = numbers.sorted();
        sortedInteger.forEach(System.out::println);
    }
}
