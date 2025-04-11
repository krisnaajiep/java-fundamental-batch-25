package com.juaracoding.perulangan;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 11/04/25 23.00
@Last Modified 11/04/25 23.00
Version 1.0
*/

public class Break {

    public static void main(String[] args) {

        String  name = "Krisna Ajie Prasetyo";
        String[] names = name.split(" ");

        // Print Middle Name
        for (int i = 0; i < names.length; i++) {
            if (i == 1) {
                System.out.println("Middle Name: " + names[i]);
                break;
            }
        }

    }

}
