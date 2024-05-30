package com.demo.strings;

public class Concatingstrings {

//	public static void main(String[] args) {
//		String s1 ="Hello";
//		String s2 = " World!";
//		String s3 = " Welcome";
//		//case1
////		  String concatenatedString = s1 + " " + s2 + " " + s3;
////	        System.out.println(concatenatedString);
//		
//		//case2
//		 String s4 = s1.concat(s2).concat(s3);
//		 System.out.println(s4);
//		
//	}
	
	 public static String concatenateStrings(String[] strings) {
	        StringBuilder result = new StringBuilder();
	        for (String str : strings) {
	            result.append(str);
	        }
	        return result.toString();
	    }
	 public static void main(String[] args) {
	        String[] strings = {"Hello", " ", "world", "!"};
	        String concatenatedString = concatenateStrings(strings);
	        System.out.println(concatenatedString);
	    }

}
