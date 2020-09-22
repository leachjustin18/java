package com.justinLeach;

public class Main {

    public static void main(String[] args) {
        int resultAdd = 10 + 3;
        System.out.println("Add " + resultAdd);

        int resultSubtract = 10 - 3;
        System.out.println("Subtract " + resultSubtract);

        int resultsMultiple = 10 * 3;
        System.out.println("Multiple " + resultsMultiple);

        // Division of whole results whole numbers
        int resultsDivide = 10 / 3;
        System.out.println("Divide " + resultsDivide);

        // Division of whole results whole numbers
        double resultsDivideDouble = (double) 10 / (double) 3;
        System.out.println("Divide double " + resultsDivideDouble);

        int x = 1;
        x++;
        System.out.println("Increment " + x);

        int x2 = 1;
        // Because the ++ is after x2, y2 has x original value
        int y2 = x2++;

        System.out.println("X2 " + x2);
        System.out.println("Y2 " + y2);

        int x3 = 1;
        // Because the ++ is before x3, it takes the value and adds 1 during compile
        int y3 = ++x3;

        System.out.println("X3 " + x3);
        System.out.println("Y3 " + y3);

        int x4 = 1;
        x4 = x4 + 2;
        System.out.println("Adding 2 to x4 with two " + x4);


        int x5 = 1;
        // Preferred way
        // Same idea of minus
        x5 += 2;
        System.out.println("Short hand of adding two " + x5);
    }
}
