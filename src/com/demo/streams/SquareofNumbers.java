package com.demo.streams;

import java.util.Arrays;

import java.util.List;
import java.util.stream.Collectors;

public class SquareofNumbers {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,2,4,5,2,5,1,5,6);
		List<Integer> numbers = num.stream().distinct().map(s->s*s).collect(Collectors.toList());
		System.out.println(numbers);
		
		
		
	}

}
