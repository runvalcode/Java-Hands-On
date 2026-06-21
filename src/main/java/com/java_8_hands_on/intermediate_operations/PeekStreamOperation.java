package com.java_8_hands_on.intermediate_operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class PeekStreamOperation {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(100,230,4323,3420,900,100,450);
        Stream<Integer> numberStream = numbers.stream()
                .filter((Integer number) -> number > 50)
                .peek((Integer number)-> System.out.print(number+" "))
                .map((Integer number )-> 2*number);
        numberStream.forEach(System.out::println);

    }
}
