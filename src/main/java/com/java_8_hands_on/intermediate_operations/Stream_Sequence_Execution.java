package com.java_8_hands_on.intermediate_operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_Sequence_Execution {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(100,900,600,400,500,300);
        Stream<Integer> filterStream = numbers.stream()
                .filter((Integer number)-> number > 100)
                .peek((Integer number)-> System.out.println("From Filter Operation Result :: "+number))
                .map((Integer number)-> number * -1)
                .peek((Integer number)-> System.out.println("From Map Operation Result :: "+number))
                .sorted()
                .peek((Integer number)-> System.out.println("From Sorted Operation Result :: "+number));

        List<Integer> filterList = filterStream.collect(Collectors.toList());
        filterList.forEach(System.out::println);
    }
}
