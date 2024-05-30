package com.demo.arrays;

public class StringComparison {

	public static void main(String[] args) {
		String s1 = "Hello World";
		String s2 = "Hello World";
		
		boolean isIdentical = compareStrings(s1,s2);
		
		if (isIdentical) {
            System.out.println("Both strings are identical.");
        } else {
            System.out.println("Both strings are not identical.");
        }

	}

	private static boolean compareStrings(String s1, String s2) {
		if(s1.length()!=s2.length()) {
			return false;	
		}
		for(int i=0; i<s1.length(); i++) {
			if(s1.charAt(i)!=s2.charAt(i)) {
				return false;
			}
		}
		return true;
	}

}
