package com.juaracoding.perulangan;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 11/04/25 23.05
@Last Modified 11/04/25 23.05
Version 1.0
*/

public class Continue {

    public static void main(String[] args) {

        // Print odd numbers
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1) {
                continue;
            }

            System.out.println(i);
        }

    }

}
