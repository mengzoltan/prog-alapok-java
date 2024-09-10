package com.training360.introcontrol;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {

            System.out.println("even");

        } else if (number % 3 == 0) {

            if (number <= 9){
                System.out.println("<=9");
            }

            System.out.println("odd");

        } else {
            System.out.println("else");
        }

        if(number < 10){
            System.out.println("less than 10");
        }

        System.out.println("Normal line");

        for (int i = 0; i < number; i++) {
            int x = i +1;
            if (x % 2 == 0) {
                System.out.print(x+", ");
            }
        }

    }
}
