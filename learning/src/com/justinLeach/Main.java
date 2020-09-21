package com.justinLeach;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Arrays have a fixed length when defined
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        //Prints address of array
        System.out.println("Address of array " + numbers);

        //Print values of array
        System.out.println("To string " + Arrays.toString(numbers));

        int[] numbersDefined = {2, 3, 4, 5, 1};

        System.out.println("Array defined");
        System.out.println(Arrays.toString(numbersDefined));
        System.out.println("Length " + numbersDefined.length);

        //Sort
        Arrays.sort(numbersDefined);
        System.out.println("Sorted " + Arrays.toString(numbersDefined));
    }
}
