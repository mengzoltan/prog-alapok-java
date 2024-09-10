package com.training360.classstructuremethods;

import java.util.Scanner;

public class NoteMain {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Név:");

        String name = scanner.nextLine();

        Note note = new Note(name, "korte");

        System.out.println(note.getName());
        System.out.println(note.getTopic());

        note.setName(name);

        System.out.println(note.getName());

        System.out.println("Téma:");
        String topic = scanner.nextLine();
        note.setTopic(topic);

        System.out.println("Jegyzet szövege:");
        String text = scanner.nextLine();
        note.setText(text);

        System.out.println(note.getNoteText("---"));

        note.getNoteText("asd");
    }
}