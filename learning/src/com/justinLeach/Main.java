package com.justinLeach;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[][] numbers = new int[2][3];
        numbers[0][0] = 1;
        System.out.println(Arrays.deepToString(numbers));

        int[][] multiDimensionInit = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(multiDimensionInit));
    }
}
