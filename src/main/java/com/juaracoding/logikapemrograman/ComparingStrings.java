package com.juaracoding.logikapemrograman;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 12/04/25 03.27
@Last Modified 12/04/25 03.27
Version 1.0
*/

public class ComparingStrings {

    public static void main(String[] args) {

        String firstName = "Krisna";
        String middleName1 = "Ajie";
        String middleName2 = "Ajie";

        System.out.println(firstName.compareTo(middleName1)); // 10 (middleName1 > firstName)
        System.out.println(middleName1.compareTo(firstName)); // -10 (middleName1 < firstName)
        System.out.println(middleName1.compareTo(middleName2)); // 0 (middleName1 = middleName2)

    }

}
