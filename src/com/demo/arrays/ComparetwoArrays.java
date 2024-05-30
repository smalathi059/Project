package com.demo.arrays;

import java.util.Arrays;

public class ComparetwoArrays {

	public static void main(String[] args) {
		int[] arr1 = {3, 2, 5, 7};
		int[] arr2 = {2, 3, 5, 7};
		
		 if (areEqual(arr1, arr2))
	            System.out.println("Yes, these two arrays are same");
	        else
	            System.out.println("No, these two arrays are not same");

	}

	  static boolean areEqual(int[] arr1, int[] arr2) {

			Arrays.sort(arr1);
			Arrays.sort(arr2);
			return Arrays.equals(arr1, arr2);
	}

	

}
