package com.training360.introdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        System.out.println(today.getDayOfMonth());
        System.out.println(today.getDayOfWeek());
        System.out.println(today.getDayOfYear());
        System.out.println(today.getMonth());
        System.out.println(today.getYear());

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println(now.getNano());
        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());
        System.out.println(now.isBefore(LocalDateTime.of(2024, Month.SEPTEMBER, 10, 13, 59)));
        System.out.println(now.minusDays(1));
        System.out.println();

        LocalTime time = LocalTime.now();
        System.out.println(time);
        System.out.println(time.getHour());
        System.out.println(time.getNano());

    }
}
