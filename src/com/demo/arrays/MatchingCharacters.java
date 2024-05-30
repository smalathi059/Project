package com.demo.arrays;

public class MatchingCharacters {

	public static void main(String[] args) {
		String string1 = "abcd";
		String string2 = "abad";
		
		String Count = count(string1,string2);

	}

	private static String count(String string1, String string2) {
	int count=0;
//		for (int i = 0; i < string1.length(); i++)
//        { 
//            if (string2. indexOf(string1.charAt(i)) >= 0) 
//            {
//                count += 1; 
//        } 
		for (int i = 0; i < string1.length(); i++) {
		    char ch = string1.charAt(i);
		    for (int j = 0; j < string2.length(); j++) {
		        if (ch == string2.charAt(j)) {
		            count++;
		            break; // Break out of the inner loop once a match is found
		        }
		    }
		}

    
        System.out.println("Number of matching characters: "+count);
		return string2;
		
	}

}
