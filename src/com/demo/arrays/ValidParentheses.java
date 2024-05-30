package com.demo.arrays;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        String s1 = "()[]{}";
        String s2 = "(]";

        System.out.println("Is " + s1 + " valid? " + isValid(s1));
        System.out.println("Is " + s2 + " valid? " + isValid(s2));
    }

    public static boolean isValid(String s) {
        int length = s.length();
        char[] array = s.toCharArray();
        if (length == 0) return true;
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < length; i++) {
            if (array[i] == '(' || array[i] == '{' || array[i] == '[') {
                stack.push(array[i]);
            }
            if (array[i] == ')' || array[i] == '}' || array[i] == ']') {
                if (stack.isEmpty()) return false;
                char temp = stack.pop();
                if ((temp == '(' && array[i] == ')') || (temp == '{' && array[i] == '}') || (temp == '[' && array[i] == ']')) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
