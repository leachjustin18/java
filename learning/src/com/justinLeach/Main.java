package com.justinLeach;

public class Main {

    public static void main(String[] args) {
        //Implicit casting
        // byte > short > int > long > float > double
        short x = 1;
        int y = x + 2;
        System.out.println("Y " + y);

        double x2 = 1.1;
        double y2 = x2 + 2; // 2 becomes 2.0
        System.out.println("Y2 " + y2);

        //Explicit casing

        double x3 = 1.1;
        int y3 = (int)(x3) + 2;
        System.out.println("Y3 " + y3);
    }
}
