package com.training360.classstructureio;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Kérem a nevét
        System.out.println("Name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        // Kérem a születési évet
        System.out.println("Year of birth: ");
        int yearOfBirth = scanner.nextInt();

        System.out.println("Neve: "+name + " Életkora: "+ (2024-yearOfBirth));
    }
}
