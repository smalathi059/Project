package com.demo.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountingEmpty {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Arthi","","Deppthi","","Mahi","Ashwin","sai","ram","akhila");
		
		//count empty strings
		long CountEmpty=names.stream().filter(x->x.isEmpty()).count();
		System.out.println("Count Empty Strins"+CountEmpty);
		
		//Count String whose length is more than three
		long CountString = names.stream().filter(s->s.length()>3).count();
		System.out.println("Count String length more than three "+CountString);
		
		//Count number of String which starts with "a"
		long NameStart = names.stream().filter(s->s.toLowerCase().startsWith("a")).count();
		System.out.println("Name Start with 'a' count "+NameStart);
		
		//Remove all empty Strings from List
		 names.stream().filter(s->!s.isEmpty()).collect(Collectors.toList()).forEach(System.out::println);
		 
		 //Convert String to uppercase and Join them with coma

		 List<String> Converttouppercase = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada"); 
		 String conversion = Converttouppercase.stream() .map(x -> x.toUpperCase()) .collect(Collectors.joining("|| "));
		 System.out.println(conversion);
		 
	}

}
