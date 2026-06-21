package com.java_8_hands_on.intermediate_operations;

import java.util.Arrays;
import java.util.stream.Stream;

public class SortedStreamOperation {
    public static void main(String[] args) {
        Integer[] arr = {1001,450,6540,120,12,65,1,90,450};

        // default sorting ascending
        Stream<Integer> sortedStream = Arrays.stream(arr).sorted();
        sortedStream.forEach((Integer number) -> System.out.print(number+" "));
        System.out.println();

        // reverse sorting
        Stream<Integer> reverseSorted = Arrays.stream(arr).sorted((Integer num1, Integer num2) -> num2 - num1).distinct();
        reverseSorted.forEach((Integer number) -> System.out.print(number+" "));


    }
}
