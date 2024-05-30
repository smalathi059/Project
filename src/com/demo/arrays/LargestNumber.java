package com.demo.arrays;

import java.util.Arrays;

public class LargestNumber {
	
	public static int findFifthLargest(int[] array) {
		Arrays.sort(array);
        return array[array.length - 5];
    }

	public static void main(String[] args) {
	
		int[] array = {21,24,65,32,14,87,56,98,12,54,47};
		 int fifthLargest = findFifthLargest(array);
	        System.out.println("Fifth largest number: " + fifthLargest);
		

	}

}
