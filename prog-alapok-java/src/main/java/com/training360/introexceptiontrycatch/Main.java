package com.training360.introexceptiontrycatch;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        try {
            new Main().parse(s);
            System.out.println("sdfsfs");
        }catch (NumberFormatException nfe) {
            System.out.println(nfe.getMessage());
            nfe.printStackTrace();
        }
        System.out.println("End.");

    }

    private void parse(String s) {
        int i = Integer.parseInt(s);
        System.out.println(i);
        System.out.println("try belseje");

    }
}
