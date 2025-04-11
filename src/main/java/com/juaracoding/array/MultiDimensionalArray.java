package com.juaracoding.array;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 11/04/25 23.18
@Last Modified 11/04/25 23.18
Version 1.0
*/

public class MultiDimensionalArray {

    public static void main(String[] args) {

        int[][] numbers = {{1}, {1, 2}, {1, 2, 3}, {1, 2, 3, 4}, {1, 2, 3, 4, 5}};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }

            System.out.println();
        }

    }

}
