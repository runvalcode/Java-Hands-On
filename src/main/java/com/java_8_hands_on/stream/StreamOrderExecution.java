package com.java_8_hands_on.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOrderExecution {

    public static void main(String[] args) {

        // order of execution - intermediate and terminal operation
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Stream<Integer> integerStream = Arrays.stream(numbers);

        Stream<Integer> filteredStream = integerStream.filter(number -> {
            System.out.println("Applying filter on number" + number);
            return number > 5;
        });

        Stream<String> mappedStream = filteredStream.map(number -> {
            System.out.println("map number to string " + number);
            switch (number) {
                case 1:
                    return "one";
                case 2:
                    return "two";
                case 3:
                    return "three";
                case 4:
                    return "four";
                case 5:
                    return "five";
                case 6:
                    return "six";
                case 7:
                    return "seven";
                case 8:
                    return "eight";
                case 9:
                    return "nine";
                case 10:
                    return "ten";
                default:
                    return "number in word not available";
            }
        });

        List<String> numbersInWords = mappedStream.collect(Collectors.toList());

//		long totalWords = mappedStream.count();
//		System.out.println(totalWords);

        numbersInWords.forEach(System.out::println);

        // try to comment-out forEach line.
        // mappedStream.forEach(number -> System.out.println(number));

        /*
         * java streams are lazy in nature, when terminal operation performs only that
         * time stream start to process operation
         */
    }
}
