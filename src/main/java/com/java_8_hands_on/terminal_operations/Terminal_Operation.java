package com.java_8_hands_on.terminal_operations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Terminal_Operation {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(103, 902, 607, 408, 510, 311);

        // 1-foreach terminal operation
        numbers.stream().filter((Integer number) -> number % 2 == 0).forEach((Integer val) -> System.out.print(" " + val));

        // 2-to-array terminal operation
        Object[] arr = numbers.stream().filter((Integer number) -> number % 2 != 0).toArray();
        Arrays.stream(arr).forEach(System.out::println);

        // 3-to-array with specific datatype containing
        Integer[] arrWithInteger = numbers.stream()
                .filter((Integer num) -> num % 3 == 0)
                .toArray((int size) -> new Integer[size]);

        Arrays.stream(arrWithInteger).forEach((Integer number) -> System.out.print(number + " "));
        System.out.println();

        //4- associative accumulation aggregate function i.e reduce,sum etc.
        List<Integer> numbersList = Arrays.asList(10, 30, 40, 90, 20);
        Optional<Integer> sum = numbersList.stream()
                .reduce((Integer number1, Integer number2) -> (number1 + number2));
        System.out.println(sum.get());

        //5. collect method helps to collect elements
        List<Integer> collectedIntegers = numbersList.stream()
                .filter((Integer number) -> number % 10 == 0).collect(Collectors.toList());
        collectedIntegers.forEach(System.out::println);

        //6. min method
        Optional<Integer> minElement = numbersList.stream()
                .min((Integer number1 , Integer number2) -> number2 - number1);
        System.out.println("Min Element from List ::: " + minElement.get());

    }
}
