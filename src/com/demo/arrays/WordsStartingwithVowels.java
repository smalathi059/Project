package com.demo.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WordsStartingwithVowels {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("java", "Iskan", "Python","Android","JavaScipt");
		
		 List<String> wordsStartingWithVowels = words.stream()
	                .filter(word -> word.matches("^[aeiouAEIOU].*"))
	                .collect(Collectors.toList());
		 
		 System.out.println("Words starting with vowels: " + wordsStartingWithVowels);
	}
	

}
