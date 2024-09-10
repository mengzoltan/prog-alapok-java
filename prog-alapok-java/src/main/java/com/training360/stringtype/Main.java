package com.training360.stringtype;

public class Main {
    public static void main(String[] args) {
        String s = args[0];
        System.out.println("alma" == s);

        char c = 'w';

        System.out.println("Alma".equalsIgnoreCase(s));

        System.out.println(s.length());

        System.out.println(s.charAt(0));

        System.out.println(s.indexOf('l'));
        System.out.println("adssadsacsdlmasdad".indexOf("lm",12));

        System.out.println(s.substring(1,3));

    }
}
