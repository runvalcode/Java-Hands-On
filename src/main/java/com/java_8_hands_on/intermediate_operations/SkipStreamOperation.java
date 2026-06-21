package com.java_8_hands_on.intermediate_operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SkipStreamOperation {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(100,4350,650,324,340,900,800,90090);
        Stream<Integer> skipStreamNumbers =  numbers.stream().skip(2);
        List<Integer> streamNumbers = skipStreamNumbers.collect(Collectors.toList());
        System.out.println(streamNumbers);
    }
}
