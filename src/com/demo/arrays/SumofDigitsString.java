package com.demo.arrays;

public class SumofDigitsString {

	public static void main(String[] args) {
		String s= "ab12pq34";
		int sum=0;
		
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(Character.isDigit(ch)) {
				sum=sum+Character.getNumericValue(ch);
			}
		}
		System.out.println("Sum of digits in the sum: "+sum);
	}

}
