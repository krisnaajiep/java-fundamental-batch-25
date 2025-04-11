package com.juaracoding.array.sorting;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 11/04/25 23.25
@Last Modified 11/04/25 23.25
Version 1.0
*/

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] numbers = {72, 23, 36, 15, 51, 46, 88, 16, 9, 58};

        System.out.println("Unsorted Array: " + Arrays.toString(numbers));

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Array: " + Arrays.toString(numbers));

    }

}
