package com.demo.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenandOddNumStreams {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30);

		int sumOfEvenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0) 
                .mapToInt(Integer::intValue) 
                .sum(); 

        int sumOfOddNumbers = numbers.stream()
                .filter(n -> n % 2 != 0) 
                .mapToInt(Integer::intValue) 
                .sum(); 

        System.out.println("Sum of even numbers: " + sumOfEvenNumbers);
        System.out.println("Sum of odd numbers: " + sumOfOddNumbers);
		
	}

}
