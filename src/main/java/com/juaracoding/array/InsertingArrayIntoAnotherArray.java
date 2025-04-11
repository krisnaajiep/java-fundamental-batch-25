package com.juaracoding.array;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 12/04/25 00.29
@Last Modified 12/04/25 00.29
Version 1.0
*/

import java.util.Arrays;

public class InsertingArrayIntoAnotherArray {

    public static void main(String[] args) {

        int[] numbers1 = {1, 2, 3, 4, 5, 10};
        int[] numbers2 = {6, 7, 8, 9};
        int target = 5;

        int[] numbers3 = new int[numbers1.length + numbers2.length];

        for (int i = 0; i < target; i++) {
            numbers3[i] = numbers1[i];
        }

        for (int j = target; j < target + numbers2.length; j++) {
            numbers3[j] = numbers2[j - target];
        }

        for (int k = target + numbers2.length; k < numbers3.length; k++) {
            numbers3[k] = numbers1[k - numbers2.length];
        }

        System.out.println("Merged Array: " + Arrays.toString(numbers3));

    }

}
