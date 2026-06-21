package com.java_8_hands_on.intermediate_operations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_Hands_On {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(290);
        numbers.add(300);
        numbers.add(405);
        numbers.add(505);

        // Different Ways to create Stream
        Stream<Integer> streamOfNumbers = streamUsingCollection(numbers);

        // using arrays Stream
        Integer[] numbersArray = {400,500,600,700,800};
        Stream<Integer> streamOfNumbers1 = Arrays.stream(numbersArray);

        // using static stream method
        Stream<Integer> staticStream = Stream.of(900,500,300,400,500);

        // using Stream builder method
        Stream.Builder<Integer> streamBuilder = Stream.builder();
        streamBuilder.add(9000).add(10000).add(5000).add(6000);

        // using stream iterator method
        Stream<Integer> stream = Stream.iterate(1000,(Integer n) -> n + 5000).limit(9);
        System.out.println(stream.count());
    }

    public static Stream<Integer> streamUsingCollection(List<Integer> numbers){
        return numbers.stream();
    }

}
