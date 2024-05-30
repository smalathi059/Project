package com.demo.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DuplicateElementsUsingStreams {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 8);
		numbers.stream().filter(itr -> Collections.frequency(numbers, itr) > 1)
        .forEach(System.out::println); 
     System.out.println("Count of duplicate items: ");    
       
     System.out.println(numbers.stream()
    	       .filter(itr -> Collections.frequency(numbers, itr) > 1)
    	       .count());
	}

}
