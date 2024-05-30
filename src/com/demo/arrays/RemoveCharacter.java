package com.demo.arrays;

public class RemoveCharacter {

	public static void main(String[] args) {
		String s1 = "Hello World Welcome to India";
		char charToRemove = 'o';
		
		String resultString = removeCharacter(s1, charToRemove);
		System.out.println("Original string: " + s1);
        System.out.println("String after removing '" + charToRemove + "': " + resultString);
	}

	 static String removeCharacter(String s1, char charToRemove) {
		 return s1.replaceAll(String.valueOf(charToRemove), "");
	}

}
