package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NumberStartswithone {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        List<Integer> numbers = new ArrayList<Integer>();
	        System.out.println("Enter numbers :");
	        while (sc.hasNextInt()) {
	            int num = sc.nextInt();
	            numbers.add(num);
	        }
	        sc.close();

	        System.out.println("Numbers entered: " + numbers);

	        List<String> startWithNumber = numbers.stream().map(n->n.toString()).
	        		filter(num->num.startsWith("1")).collect(Collectors.toList());
	                
	        System.out.println(startWithNumber);

	}

}
