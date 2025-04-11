package com.juaracoding.stringobject;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 11/04/25 06.17
@Last Modified 11/04/25 06.17
Version 1.0
*/

public class AccessCharFromString {

    public static void main(String[] args) {

        String stringMiddleName = "Ajie";

        // Access a Character in a String
        char middleNameFirstChar = stringMiddleName.charAt(0);
        char middleNameLastChar = stringMiddleName.charAt(stringMiddleName.length() - 1);
        System.out.println("Middle Name First Char: " + middleNameFirstChar);
        System.out.println("Middle Name Last Char: " + middleNameLastChar);

    }

}
