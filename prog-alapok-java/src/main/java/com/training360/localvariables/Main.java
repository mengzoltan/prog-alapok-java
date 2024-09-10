package com.training360.localvariables;

import java.nio.file.attribute.UserDefinedFileAttributeView;

public class Main {

    private int x;
    private double y;
    private String s;
    private boolean b;
    private Integer integer;
    private Boolean aBoolean;

    // Példányváltozót deklarálok és inicializálok is egy helyen
    private double d = 0.9;

    // Deklarálás, és init a konstruktorban
    private String s2;

    public Main() {
        //s2 = "alma";
        this.s2 = "alma";
    }

    public Main(String s2) {
        this.s2 = s2;
    }

    public static void main(String[] args) {
        // Deklarálunk változókat
        int a;
        int b;

        // Példányváltozók default értéke
        Main main = new Main("alma");

        System.out.println(main.getX());
        System.out.println(main.y);
        System.out.println(main.s);
        System.out.println(main.b);
        System.out.println(main.integer);
        System.out.println(main.aBoolean);

        // Lokális változóknál nincs default érték - inicializálni kell
        a = 7; // inicializálás
        System.out.println(a);

        a = 9;
        System.out.println(a);

        // Deklarálás és inicializálás egy helyen
        int i = 0;
        System.out.println(i);

        System.out.println(main.d);

        System.out.println(main.s2);

        String localString;

        localString = null;

        System.out.println(localString);

        double localDouble = 8.1;
        double localDouble2 = 8.9;

        System.out.println(localDouble);
        System.out.println(localDouble2);

        System.out.println((int) localDouble);
        System.out.println((int) localDouble2);

        int k = 10_000;

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Long.MAX_VALUE);

        Integer integer1 = 9;
        long l = integer1.longValue();

        System.out.println(Short.MAX_VALUE);

        System.out.println(Byte.MAX_VALUE);

        long l2 = 4;

        System.out.println(1.0/2);

    }

    public int getX() {
        return x;
    }

    public boolean isB() {
        return b;
    }
}
