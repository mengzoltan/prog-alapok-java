package com.training360.filereadwrite;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainWriter {

    public static void main(String[] args) {
        List<String> lines = new ArrayList<>(Arrays.asList("alma", "banana", "valami hosszabb"));

        try {
            Files.write(Paths.get("writeexample.txt"), lines);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Done");
    }
}
