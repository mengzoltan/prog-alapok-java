package com.training360.classstructureattributes.client;

import java.util.Scanner;

public class ClientMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Client name: ");
        String name = scanner.nextLine();
        System.out.println("Client birth date: ");
        int brithYear = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Client address: ");
        String address = scanner.nextLine();

        Client client = new Client();
        client.name = name;
        client.year = brithYear;
        client.address = address;

        System.out.println("Client details: " + client.name + "\n" + client.year + "\n" + client.address);
    }
}
