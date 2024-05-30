package com.demo.arrays;

public class FindingSpecialCharacters {

	public static void main(String[] args) {
		String s = "Hello!World@&Welcome123**";
		int specialCount = 0;
		
		System.out.println(s);
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			  if (!Character.isLetter(ch) && !Character.isDigit(ch)) {
	                System.out.print(ch + " ");
	                specialCount++;
	            }
		}
		System.out.println("\nTotal special characters: " + specialCount);
	}

}
