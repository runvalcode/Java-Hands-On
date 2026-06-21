package com.java_8_hands_on.intermediate_operations;

import java.util.stream.Stream;

public class MapStreamOperation {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("HELLO","EVERYONE","HI","HOW","ARE YOU","DOING");
        Stream<String> lowerCaseNames = names.map(String::toLowerCase);
        lowerCaseNames.forEach(System.out::println);
    }
}
