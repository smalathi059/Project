package com.demo.arrays;

import java.util.Arrays;

public class AnagramChecker {

	public static void main(String[] args) {
		String s1 = "I am Programmer";
		String s2 = "Programmer I am";
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		if(s1.length()==s2.length());
		
		char[] chArray1 = s1.toCharArray();
		char[] chArray2 = s2.toCharArray();
		
		Arrays.sort(chArray1);
		Arrays.sort(chArray2);
		
		boolean result = Arrays.equals(chArray1, chArray2);
		if(result) {
	        System.out.println(s1 + " and " + s2 + " are anagram.");
	      }
	      else {
	        System.out.println(s1 + " and " + s2 + " are not anagram.");
	      }
	    }

	}


