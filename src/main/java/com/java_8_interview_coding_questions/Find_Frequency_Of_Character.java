package com.java_8_interview_coding_questions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Find_Frequency_Of_Character {
    public static void main(String[] args) {
        String str = "programming";
        List<Character> characterList = str.chars().mapToObj(c -> (char)c).collect(Collectors.toList());
        Map<Character,Long> countingMap = new LinkedHashMap<>();
                characterList.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().forEach( entry -> countingMap.put(entry.getKey(),entry.getValue()));
        System.out.println(countingMap);
    }
}
