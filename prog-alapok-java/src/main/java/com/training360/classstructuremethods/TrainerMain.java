package com.training360.classstructuremethods;


public class TrainerMain {

    public static void main(String[] args) {

        Trainer trainer = new Trainer();

        trainer.setName("John Doe");
        trainer.setYearOfBirth( 1998);

        System.out.println("Name: " + trainer.getName());

        trainer.setName("Jack Doe");

        System.out.println("Meghívtuk a setter függvényt....");

        System.out.println("Name: " + trainer.getName());
        String trainerName = trainer.getName();
        System.out.println("Name: " + trainer.getName());

        System.out.println(trainerName);

        int age = trainer.getAge(2024);

        System.out.println(age);

        System.out.println(age + 2 );

        trainer.printTrainer(2024);

    }
}
