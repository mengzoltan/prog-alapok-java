package com.training360.classstructureio;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculator app");
        System.out.println();

        System.out.print("Kérem az első számot: ");
        int a = scanner.nextInt();
        System.out.print("Kérem az második számot: ");
        int b = scanner.nextInt();

        System.out.println();
        System.out.println(a + " + " + b);
        System.out.println("Eredmény: " + (a+b));
    }
}
