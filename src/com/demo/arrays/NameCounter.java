package com.demo.arrays;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class NameCounter {

    public static void main(String[] args) {
        String[] names = {"Malathi", "Deepthi", "Lalitha", "Murali", "Rithwik", "Murali", "Lalitha","Malathi","Deepthi","Malathi"};

        Map<String, Long> nameCountMap = Arrays.stream(names)
                .collect(Collectors.groupingBy(name -> name, Collectors.counting()));

        nameCountMap.forEach((name, count) -> System.out.println(name + ": " + count));

    }
}
