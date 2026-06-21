package com.java_8_hands_on.intermediate_operations;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class FlapMapStreamOperation {
    public static void main(String[] args) {

        List<List<String>> sentenceList = Arrays.asList(
                Arrays.asList("I","LOVE","JAVA"),
                Arrays.asList("CONCEPTS","ARE","CLEAR"),
                Arrays.asList("ITS","VERY","COMPLEX")
        );

        // Stream<String> wordStream = sentenceList.stream().flatMap((List<String> str)-> str.stream());
        Stream<String> wordStream = sentenceList.stream().flatMap(Collection::stream);
        wordStream.forEach((String w) -> System.out.println(w+" "));

        // flatmap iteration by another way
        Stream<String> wordStream1 = sentenceList.stream().flatMap((List<String> sentence) -> sentence.stream().map(String::toLowerCase));
        wordStream1.forEach(System.out::println);
    }
}
