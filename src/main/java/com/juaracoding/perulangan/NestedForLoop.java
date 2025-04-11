package com.juaracoding.perulangan;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 11/04/25 08.07
@Last Modified 11/04/25 08.07
Version 1.0
*/

public class NestedForLoop {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print('*');

            }

            System.out.println();
        }

    }

}
