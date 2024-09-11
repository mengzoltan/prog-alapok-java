package com.training360.filereadwrite.todolist;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/*
  Írjuk ki a felhasználónak, hogy Todo lista
  Írjuk ki, hogy az x -el lép ki.

  Amíg nem nyom x gombot, addig amit soronként beír, azt mentsük el egy listába
  Majd az x megnyomása és enter után köszönjünk el és írjuk ki egy todolist.txt file-ba a bevitt elemeket.

 */
public class Todo {

    public static void main(String[] args) {
        Todo todo = new Todo();
        todo.menu("todolist.txt");
    }

    public void menu(String path) {
        System.out.println("Todo lista");
        System.out.println("Exit char> x");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        boolean isNotExitChar = true;

        List<String> todoList = new ArrayList<>();

        while (isNotExitChar) {
            System.out.println("todo element: ");

            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("x")) {
                isNotExitChar = false;
            } else {
                todoList.add(input);
            }
        }

        System.out.println(todoList);


        try {
            Files.write(Paths.get(path), todoList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
