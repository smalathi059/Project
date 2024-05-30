package com.demo.arrays;

import java.util.Arrays;

public class SecondHighestNumber {

    public static void main(String[] args) {
        int[] num = {10, 5, 20, 15, 40, 25};
        int n = num.length;
        if (n < 2) {
            System.out.println("Array must contain at least two elements.");
        } else {
            int secondLargest = SecondHighestnum(num, n);
            System.out.println("The second highest number is: " + secondLargest);
        }
    }

    static int SecondHighestnum(int[] num, int n) {
        Arrays.sort(num);
        
        int largest = num[n - 1];
        
        for (int i = n - 2; i >= 0; i--) {
            if (num[i] != largest) {
                return num[i];
            }
        }
        
        return n;
    }
}
