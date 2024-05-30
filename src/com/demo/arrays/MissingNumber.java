package com.demo.arrays;

public class MissingNumber {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,9};
		int n= array.length+1;
		
		int expectedSum = n * (n + 1) / 2;
		
		int actualSum = 0;
        for (int num : array) {
            actualSum = actualSum+num;
        }
        
        int missingNumber = expectedSum - actualSum;

		System.out.println(missingNumber);
	}

}
