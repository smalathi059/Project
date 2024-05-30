package com.demo.arrays;

import java.util.Arrays;

public class LargeNumberDigits {

	public static void main(String[] args) {
		int arr[] = {8, 6, 0, 4, 6, 4, 2, 7};
		 
        int n = arr.length;
 
        System.out.println(findMaxNum(arr, n));

	}

	 static int findMaxNum(int arr[], int n){
	       
	        Arrays.sort(arr);
	 
	        int num = arr[n - 1];
	 
	        for (int i = n - 2; i >= 0; i--) {
	            num = num * 10 + arr[i];
	        }
	 
	        return num;
	    }

}
