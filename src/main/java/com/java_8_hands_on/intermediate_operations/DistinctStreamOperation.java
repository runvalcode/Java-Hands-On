package com.java_8_hands_on.intermediate_operations;

import java.util.Arrays;
import java.util.stream.Stream;

public class DistinctStreamOperation {
    public static void main(String[] args) {
        Integer[] arr = {100,1200,900,500,600,700,100,1200,500,600,1000,1560};

        Stream<Integer> distinctNumbers = Arrays.stream(arr).distinct();
        distinctNumbers.forEach((Integer number ) -> System.out.print(number+" "));

        // why intermediate operations are lazy
        Stream<Integer> filterNumbers = Arrays.stream(arr).filter((Integer number)-> number > 100).peek(System.out::println);
        // when i call terminal operation that time only system.out::println will print from peek operation
        filterNumbers.count();
    }
}
