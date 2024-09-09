package com.training360.classstructuremethods;

public class Trainer {
    private String name;
    private int yearOfBirth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getAge(int now) {
        return now - yearOfBirth;
    }

    public void printTrainer(int now) {
        System.out.println("Name: " + name + " Year of birth: " + yearOfBirth + " age: " + getAge(now));
    }
}
