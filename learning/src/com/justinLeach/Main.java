package com.justinLeach;

public class Main {

    public static void main(String[] args) {
        /*
        * Number types
        * byte 1 [-128. 127] range
        * short 2 bytes [-32K - 32k] range
        * int 4 byte [-2b, 2b] range
        * long 8 bytes
        * float 4 bytes
        * double 8 bytes
        *
        * String type
        * char 2 bytes
        *
        * Boolean
        *
        * boolean 1 byte
        * */
        byte age = 52;
        // Can be converted to a var
        long viewsCount = 4_486_481_456L;
        // Can be converted to a var
        float price = 12.99F;
        // Can be converted to a var
        char letter = 'A';
        // Can be converted to a var
        boolean isMonetized = true;

        System.out.println("Youtubers age " + age + ", youtube views " + viewsCount + ", cost to make video " + price + ", grade of most videos " + letter + ", and videos are monetized " + isMonetized);
    }
}
