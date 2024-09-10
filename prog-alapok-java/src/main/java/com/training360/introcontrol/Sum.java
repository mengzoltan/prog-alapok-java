package com.training360.introcontrol;

import java.util.Scanner;

public class Sum {

    /*
    Kérj be a felhasználótól ciklusban öt számot, és számold ki az összegüket. A Sum osztályba dolgozz
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Kérem az "+ (i+1) + ". számot: ");
            int number = scanner.nextInt();
            sum += number;
        }

        System.out.println("Az összegük: " + sum);
    }
}
