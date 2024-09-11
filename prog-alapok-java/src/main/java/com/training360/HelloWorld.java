package com.training360;


public class HelloWorld {

    private String name;

    public static void main(String[] args) {

        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setName("Hello 1");

        HelloWorld helloWorld2 = new HelloWorld();
        helloWorld2.setName("Hello 2");

        System.out.println("Hello World!");

        helloWorld.printArray(args);

        System.out.println();

// static-kent meg lehetne hivni igy is
//        printArray(args);

        helloWorld2.printArray(args);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printArray(String[] array) {
        System.out.println(array.length);
        System.out.println(name);

        for (String element : array) {
            System.out.println(element);
        }

    }
}
