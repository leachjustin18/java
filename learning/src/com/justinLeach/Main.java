package com.justinLeach;

import java.util.Date;

public class Main {

    public Main(String name, String age, String type) {
        System.out.println("My animal name is " + name + " and it is " + age + " old and it's a " + type);
    }

    public static void main(String[] args) {
        Date now = new Date();
        System.out.println("Date " + now);
        long timeString = now.getTime();
        System.out.println("Time string " + timeString);
        final Main main = new Main("Timothy", "6 months", "dog");
    }
}
