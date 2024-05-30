package com.demo.arrays;

public class ConvertString {

	public static void main(String[] args) {
		String word = "helloworld";
		int midpoint = word.length()/2;
		
		String firstHalf = word.substring(0,midpoint).toLowerCase();
				
		String SecondHalf =  word.substring(midpoint).toUpperCase();
		
		String result = firstHalf+SecondHalf;
		System.out.println("original String: "+word);
		System.out.println("Converted String "+result);
		
	}

}
