package com.training360.filereadwrite;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        String path = "src/main/resources/shoppinglist.txt";
        List<String> shList = null;


        shList = main.readFile(path);


        System.out.println(shList);
    }

    private List<String> readFile(String path) {

        List<String> shoppingList = null;
        try {
            shoppingList = Files.readAllLines(Paths.get(path));
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
//            throw e;
        }
        return shoppingList;
    }
}
