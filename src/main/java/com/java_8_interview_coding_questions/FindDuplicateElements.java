package com.java_8_interview_coding_questions;

// find duplicate elements using stream api


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateElements {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(500, 600, 700, 800, 200, 500, 600, 700);
        List<Integer> duplicateNumbers = numbers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(key -> key.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(duplicateNumbers);

    }

}
