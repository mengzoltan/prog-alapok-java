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

        String exampleString = "Nagy Bela;13;33";
        String[] split = exampleString.split(";");
        User user = new User();
        user.setName(split[0]);
        user.setAge(Integer.parseInt(split[1]));
        user.setAvg(Integer.parseInt(split[2]));

        System.out.println(user);

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
