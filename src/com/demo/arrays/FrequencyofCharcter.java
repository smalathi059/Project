package com.demo.arrays;

public class FrequencyofCharcter {

    public static void main(String[] args) {
        String str = "abbc";
        char[] ch = str.toCharArray();
        int[] count = new int[ch.length];

        for (int i = 0; i < ch.length; i++) {
            count[i] = 1;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count[i]++;
                    ch[j] = '0'; 
                }
            }
        }

        System.out.println("Character frequencies:");
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != '0') {
                System.out.println(ch[i] + " - " + count[i]);
            }
        }
    }
}
