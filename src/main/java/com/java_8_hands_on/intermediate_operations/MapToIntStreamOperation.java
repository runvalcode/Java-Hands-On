package com.java_8_hands_on.intermediate_operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class MapToIntStreamOperation {
    public static void main(String[] args) {
        List<String> numbersInString = Arrays.asList("400","5000","100","80");
        IntStream numberStream = numbersInString.stream().mapToInt((String str)-> Integer.parseInt(str));
        numberStream.forEach(System.out::println);

        List<String> longNumbersStream = Arrays.asList("400","9090","99","120");
        LongStream longNumberStream = longNumbersStream.stream().mapToLong((String str)-> Long.parseLong(str));
        longNumberStream.forEach(System.out::println);
    }
}
