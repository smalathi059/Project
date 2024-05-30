package com.demo.arrays;

import java.util.Arrays;
import java.util.Collections;

public class SortingArray {

	public static void main(String[] args) {
		Integer[] arr = {5, 2, 9, 1, 3};

        Arrays.sort(arr);

       
        Collections.reverse(Arrays.asList(arr));

        System.out.println("Array sorted in descending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

	}

}
