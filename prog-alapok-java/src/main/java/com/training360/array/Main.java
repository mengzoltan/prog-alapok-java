package com.training360.array;

public class Main {

    public static void main(String[] args) {

        // new array by values
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // new array by size
        int[] intArray2 = new int[10];

        System.out.println(intArray.length);
        System.out.println(intArray2.length);

        System.out.println(intArray[0]);
        System.out.println(intArray[9]);

        System.out.println(intArray2[3]);


        // ArrayIndexOutOfBoundsException
//        System.out.println(intArray[10]);

        String[] fruits = {"Apple", "Banana", "Orange", "Watermelon"};

        System.out.println(fruits[2]);

        System.out.println("--------");

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
            fruits[i] = fruits[i].toUpperCase();
        }

        System.out.println("Miert nem futott le?");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        Student[] students = {
                new Student("Erika", 16),
                new Student("Bob", 17),
                new Student("Jack", 18)
        };

        int sum = 0;
        for (Student student : students) {
            System.out.println(student);
            sum += student.getAge();
        }

        printStudentName(students);

        System.out.println((double) sum / students.length);
    }

    private static void printStudentName(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            String studentName = students[i].getName();

            System.out.println(studentName);
        }
    }
}
