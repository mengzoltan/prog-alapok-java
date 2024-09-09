package com.training360.classstructureattributes;


public class TrainerMain {

    public static void main(String[] args) {


        Trainer aladar = new Trainer();

        aladar.name = "Nagy Aladar Géza";
        aladar.yearOfBirth = 1992;

        System.out.println("Neve: " + aladar.name + " szül. év: " + aladar.yearOfBirth);

        Trainer bela = new Trainer();
        bela.name = "Bella Bela";
        bela.yearOfBirth = 1993;

        System.out.println("Neve: " + bela.name + " szül. év: " + bela.yearOfBirth);

        System.out.println(aladar.name);




    }
}
