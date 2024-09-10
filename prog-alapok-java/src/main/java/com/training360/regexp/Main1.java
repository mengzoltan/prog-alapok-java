package com.training360.regexp;

import java.util.regex.Pattern;

public class Main1 {
    public static void main(String[] args) {
        // Checks if the string matches with the regex
        // Should be single character a to z
        System.out.println(Pattern.matches("[a-z]", "g"));

        // Check if all the elements are non-numbers
        System.out.println(Pattern.matches("\\D+", "Gfg"));

        // Check if all the elements are non-spaces
        System.out.println(Pattern.matches("\\S+", "gfg"));


    }
}
