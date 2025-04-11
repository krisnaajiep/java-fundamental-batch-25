package com.juaracoding.stringobject;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 11/04/25 05.25
@Last Modified 11/04/25 05.25
Version 1.0
*/

public class SubString {

    public static void main(String[] args) {

        // Substring Method
        String stringFullName = "Krisna Ajie Prasetyo";
        String stringMiddleName = stringFullName.substring(7, 11);
        String stringLastName = stringFullName.substring(12);
        System.out.println("Middle Name: " + stringMiddleName);
        System.out.println("Last Name: " + stringLastName);

    }

}
