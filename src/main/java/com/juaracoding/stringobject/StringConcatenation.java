package com.juaracoding.stringobject;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 11/04/25 06.15
@Last Modified 11/04/25 06.15
Version 1.0
*/

public class StringConcatenation {

    public static void main(String[] args) {

        String stringFirstName = "Krisna ";
        String stringMiddleName = "Ajie";
        String stringLastName = " Prasetyo";

        // String Concatenation
        String stringFullName = stringFirstName.concat(stringMiddleName.concat(stringLastName));
        System.out.println("Name: " + stringFullName);

    }

}
