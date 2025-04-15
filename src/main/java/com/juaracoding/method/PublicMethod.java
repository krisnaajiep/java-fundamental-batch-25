package com.juaracoding.method;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 12/04/25 04.30
@Last Modified 12/04/25 04.30
Version 1.0
*/

public class PublicMethod {
    /**
     * Public method
     */
    public int sumArray(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }
}
