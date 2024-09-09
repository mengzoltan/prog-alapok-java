package com.training360.classstructureattributes;

import java.util.Scanner;

public class Music {

    public static void main(String[] args) {
        Song favoriteSong = new Song();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the song: ");
        String name = scanner.nextLine();

        System.out.println("Enter the band of the song: ");
        String band = scanner.nextLine();

        System.out.println("Length of the song: ");
        int length = scanner.nextInt();

        favoriteSong.band = band;
        favoriteSong.title = name;
        favoriteSong.length = length;

        System.out.println("Deatails: " + favoriteSong.title + " - " + favoriteSong.band + " - " + favoriteSong.length);

    }
}
