package com.juaracoding.stringobject;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 11/04/25 06.54
@Last Modified 11/04/25 06.54
Version 1.0
*/

public class StringSplit {

    public static void main(String[] args) {

        // Split Method
        String fullName = "Krisna Ajie Prasetyo";
        String[] strings = fullName.split(" ");

        System.out.println(strings[0] + " " + strings[1] + " " + strings[2]);

    }

}
