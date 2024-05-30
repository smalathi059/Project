package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class testDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size..");
        int arraySize=sc.nextInt();
        List<Integer> numbers = new ArrayList<Integer>();
        System.out.println("Enter numbers equals to Array size:");
        for(int i=0;i<arraySize;i++) {
        	Integer num=sc.nextInt();
        	numbers.add(num);        	
        }       

        System.out.println("Numbers entered: " + numbers);

        List<String> startWithNumber = numbers.stream().map(n->n.toString()).
        		filter(num->num.startsWith("1")).collect(Collectors.toList());
                
        System.out.println("start With Number 1 is : "+startWithNumber);
    }
}
