package com.justinLeach;

import java.util.Date;

public class Main {

    public Main(String name, byte age) {
        System.out.println("My name " + name + " and I am " + age + " year old");
    }

    private static String Animal(String name, String age, String type) {
        return "My animal's name is " + name + " and it is " + age + " old and it's a " + type;
    }

    public static void main (String[] args) {
        Date now = new Date();
        System.out.println("Date " + now);
        long timeString = now.getTime();
        System.out.println("Time string " + timeString);
        new Main("Justin", (byte) 30);
        var animal = Animal("Timothy", "6 months", "dog");
        System.out.println(animal);
    }
}
