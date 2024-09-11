package com.training360.cinema;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CinemaMain {

    public static void main(String[] args) {

        Cinema allee = new Cinema(3);

        List<Guest> guests = Arrays.asList(
                new Guest("Bob", 45, Gender.MALE),
                new Guest("Jane", 36, Gender.FEMALE),
                new Guest("John", 23, Gender.MALE),
                new Guest("Mary", 45, Gender.FEMALE),
                new Guest("John", 15, Gender.MALE),
                new Guest("Jane", 69, Gender.FEMALE)
        );

        int guestNumber = 0;
        for (int i = 0; i < allee.getSize(); i++) {
            for (int j = 0; j < allee.getSize(); j++) {
                if(guestNumber < guests.size()) {
                    allee.placeSeat(i, j, guests.get(guestNumber));
                    guestNumber++;
                }
            }
        }

        allee.printSeats();

        Random random = new Random();
        int row = random.nextInt(2);
        int col = random.nextInt(3);
        System.out.println(row + ", " + col);
        Guest anonim = allee.getGuestBySeat(row,col);
        System.out.println(anonim);


    }
}
