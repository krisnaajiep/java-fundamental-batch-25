package com.juaracoding.stringobject;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 11/04/25 06.14
@Last Modified 11/04/25 06.14
Version 1.0
*/

public class CreateStringObject {

    public static void main(String[] args) {

        // Create String Objects
        String stringFirstName = "Krisna";
        char[] arrayCharMiddleName = {'A', 'j', 'i', 'e'};
        String stringMiddleName = String.valueOf(arrayCharMiddleName);
        String stringLastName = "Prasetyo";

        System.out.println(stringFirstName);
        System.out.println(stringMiddleName);
        System.out.println(stringLastName);

    }

}
