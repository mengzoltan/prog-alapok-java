package com.training360.statements;

public class Example {

    public static void main(String[] args) {
        int i = 2 + 3;
        System.out.println(i);
        i = i + 3;
        System.out.println(i);
        i = i + 1;
        System.out.println(i);
        i += 1;
        System.out.println(i);
        i++;
        System.out.println(i);

        i += 5; // i = i + 5;
        i *= 8; // i = i * 8;

        i = 1;
        int j = (i++ + 2) * 8;

        System.out.println(i);
        System.out.println(j);

        System.out.println("//////////////////");
        i = 0;
        System.out.println(i++ * 2); // 0 * 2
        System.out.println(i); // 1

        System.out.println(++i * 2); // 2 * 2
        System.out.println(i); // 2
        System.out.println("//////////////////");

        System.out.println(9%3);
        System.out.println("//////////////////");
        System.out.println("//////////////////");
        int a = 2;
        int b = 3;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));

        System.out.println(Integer.toBinaryString(a & b));
        System.out.println(Integer.toBinaryString(a | b));
        System.out.println(Integer.toBinaryString(a ^ b));

        boolean empty = true;
        System.out.println(empty);
        System.out.println(!empty);

        System.out.println(empty? "Ures": "Tele");

        boolean greaterThan10 = b >= 10;

        if (greaterThan10 && empty) {
            System.out.println("Greater than 10");
        }
        System.out.println(true && false);
        System.out.println(false && true);

        System.out.println(false || true);
        System.out.println(true || false);

        int abc = !empty ? 2 : 3;
        System.out.println(abc);



    }
}
