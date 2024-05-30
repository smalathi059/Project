package com.demo.arrays;

public class SubStringFinder {

	public static void main(String[] args) {
		String input="abcd";
        for(int i=0;i<input.length()-1;i++) {
        	for(int j=i+1;j<=input.length();j++) {
        		System.out.println(input.substring(i,j));
        	}
        }

	}

}
