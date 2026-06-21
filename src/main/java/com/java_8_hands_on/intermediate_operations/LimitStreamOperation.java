package com.java_8_hands_on.intermediate_operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LimitStreamOperation {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(100,400,500,600,700,123,4532,567);
        Stream<Integer> streamOfInteger = numbers.stream().limit(3);
        List<Integer> filterList = streamOfInteger.collect(Collectors.toList());
        System.out.println(filterList);
    }
}
