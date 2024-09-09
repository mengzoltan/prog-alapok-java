package com.training360.classstructureio;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name: ");
        String name = scanner.nextLine();

        System.out.println("Enter email: ");
        String email = scanner.nextLine();

        System.out.println();
        System.out.println("Name: " + name + "\nEmail: " + email);
    }
}
