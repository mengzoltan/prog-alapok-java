package com.training360.classstructureconstructors;

public class Trainer {
    private String name;
    private int yearOfBirth;

    public Trainer() {
        this.name = "John Doe";
        this.yearOfBirth = 1990;
    }

    public Trainer(String name) {
        this.name = name;
    }

    public Trainer(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

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
}
