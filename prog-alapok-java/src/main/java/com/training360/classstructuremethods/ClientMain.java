package com.training360.classstructuremethods;

public class ClientMain {

    public static void main(String[] args) {
        Client client = new Client();

        client.setName("John Doe");
        client.setYear(1998);
        client.setAddress("1221 Budapest, Alma utca 4.");

        System.out.println("Név: " + client.getName());
        System.out.println("Születési év: " + client.getYear());
        System.out.println("Lakcím: " + client.getAddress());

        client.migrate("1054 Budapest, Fekete u. 34.");

        System.out.println("Új lakcíme: " + client.getAddress());
    }
}
