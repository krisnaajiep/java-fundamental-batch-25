package com.juaracoding.stringobject;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 11/04/25 06.18
@Last Modified 11/04/25 06.18
Version 1.0
*/

public class CompareString {

    public static void main(String[] args) {

        String stringMiddleName = new String("Ajie");
        String newMiddleName = "Ajie";

        // Compare Strings
        boolean equals1 = stringMiddleName == newMiddleName; // false
        boolean equals2 = stringMiddleName.equals(newMiddleName); // true
        System.out.println("Compare Middle Name Strings with (==) Operator: " + equals1);
        System.out.println("Compare Middle Name Strings with equals() Method: " + equals2);
        String newMiddleNameUpperCase = "AJIE";
        boolean equals3 = stringMiddleName.equals(newMiddleNameUpperCase); // false
        boolean equals4 = stringMiddleName.equalsIgnoreCase(newMiddleNameUpperCase); // true
        System.out.println("Compare Middle Name Strings + Case Sensitive: " + equals3);
        System.out.println("Compare Middle Name Strings + Ignore Case: " + equals4);

    }

}
