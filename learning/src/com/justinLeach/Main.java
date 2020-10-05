package com.justinLeach;

public class Main {

    public static void main(String[] args) {
        //F casts to float
        int round = Math.round(1.1F);
        System.out.println("Round " + round);

        int ceil = (int)Math.ceil(2.1F);
        System.out.println("Ceil " + ceil);

        int floor = (int)Math.floor(2.6F);
        System.out.println("Floor " + floor);

        int max = Math.max(10, 22); // same concept for min
        System.out.println("Max " + max);

        double random = Math.random();
        System.out.println("Random " + random);

        double randomAbove1 = Math.random() * 100;
        System.out.println("Random Above 0 " + randomAbove1);

        double randomAbove1Round = Math.round(Math.random() * 100);
        System.out.println("Random Above 0 Round " + randomAbove1Round);

        byte randomAbove1RoundByte = (byte)Math.round(Math.random() * 100);
        System.out.println("Random Above 0 Round Byte " + randomAbove1RoundByte);

        byte randomAbove1Byte = (byte)(Math.random() * 100);
        System.out.println("Random Above 0 Byte " + randomAbove1Byte);
    }
}
