package com.demo.arrays;

import java.util.ArrayList;
import java.util.List;

public class ContinuousSequence {
    public static void main(String[] args) {
        String input = "1 2 3 5 9 a 6 7 8 4 @ -5 -7 -3 -2 -1";
        String[] elements = input.split("\\s+");

        List<String> sequences = new ArrayList<>();
        StringBuilder sequence = new StringBuilder();

        for (int i = 0; i < elements.length; i++) {
            if (isNumeric(elements[i])) {
                sequence.append(elements[i]);
                // Check if the next element is also a number to maintain the sequence
                if (i + 1 < elements.length && isNumeric(elements[i + 1])) {
                    continue;
                } else {
                    sequences.add(sequence.toString());
                    sequence = new StringBuilder(); // Reset sequence
                }
            }
        }

        // Print sequences
        System.out.println("There are " + sequences.size() + " sequences");
        for (String seq : sequences) {
            System.out.println(seq);
        }
    }

    // Helper method to check if a string is numeric
    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }
}
