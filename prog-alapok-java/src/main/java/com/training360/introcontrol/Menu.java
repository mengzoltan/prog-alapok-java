package com.training360.introcontrol;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isNotExitChar = true;

        while (isNotExitChar) {
            System.out.println("Menu");
            System.out.println("1. 2. q: ");

            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    System.out.println("List");
                    break;
                case "2":
                    System.out.println("Add");
                    break;
                case "q":
                    System.out.println("Exit");
                    isNotExitChar = false;
            }
        }
    }
}
