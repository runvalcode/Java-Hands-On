package com.java_8_hands_on.intermediate_operations;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterStreamOperation {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("HELLO","HI","WELCOME","WORLD","PROGRAMMING");

        // (str.length() <= 15) this is predicate
        Stream<String> filterString = names.filter((String str) -> (str.length() <= 15));
        List<String> listOfFilterString = filterString.collect(Collectors.toList());

        System.out.println(listOfFilterString);
    }
}
