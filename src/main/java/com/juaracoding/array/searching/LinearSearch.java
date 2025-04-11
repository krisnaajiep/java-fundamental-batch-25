package com.juaracoding.array.searching;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 12/04/25 00.10
@Last Modified 12/04/25 00.10
Version 1.0
*/

public class LinearSearch {

    public static void main(String[] args) {

        int[] numbers = {72, 23, 36, 15, 51, 46, 88, 16, 9, 58};
        int target = 16;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println("Found: " + numbers[i]);
            }
        }

    }

}
