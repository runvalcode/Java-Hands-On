package com.java_8_interview_coding_questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Remove_Duplicate_Elements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(100,300,400,500,800,800,100,300);
        List<Integer> uniqueNumbers = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueNumbers);
    }
}
