package com.demo.arrays;

public class ReverseString {

	//without using third variable
//	public static void main(String[] args) {
//		String name= "Hello World!";
//		System.out.println(name);
//		String reverestring = " ";
//		int length = name.length();
//		
//		for(int i=length-1;i>=0;i--) {
//			reverestring = reverestring+name.charAt(i);
//		}
//		
//		System.out.println("Reverse String"+reverestring);
//	}

	
	//with third variable
	 public static String reversedElements(String str) {
	        char[] charArray = str.toCharArray();
	        int length = charArray.length;

	        for (int i = 0; i < length / 2; i++) {
	            char temp = charArray[i];
	            charArray[i] = charArray[length - i - 1];
	            charArray[length - i - 1] = temp;
	        }

	        return new String(charArray);
	    }
	
  public static void main(String[] args) {
      String str = "Hello, Malathi";
      System.out.println("Original string: " + str);
      String reversedStr = reversedElements(str);
      System.out.println("Reversed string: " + reversedStr);
  }
}

