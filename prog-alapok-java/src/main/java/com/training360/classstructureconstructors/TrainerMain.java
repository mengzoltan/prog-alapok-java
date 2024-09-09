package com.training360.classstructureconstructors;


import java.util.Scanner;

public class TrainerMain {

    public static void main(String[] args) {


        Trainer john = new Trainer();
        Trainer jack = new Trainer("Jack Smith");

        Trainer mary = new Trainer("Mary Smith", 1987);

        System.out.println("Neve: " + john.getName() + " szül. év: " + john.getYearOfBirth());

        System.out.println("Neve: " + jack.getName() + " szül. év: " + jack.getYearOfBirth());

        System.out.println("Neve: " + mary.getName() + " szül. év: " + mary.getYearOfBirth());


        Scanner scanner = new Scanner(System.in);

        System.out.println("Name: ");
        String name = scanner.nextLine();

        System.out.println("Year of Birth: ");
        int yearOfBirth = scanner.nextInt();

        Trainer trainer = new Trainer(name, yearOfBirth);

        System.out.println("Name: "+ trainer.getName() + ", yearOfBirth: "+ trainer.getYearOfBirth());



    }
}
