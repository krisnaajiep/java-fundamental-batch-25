package com.juaracoding.wrapperclass;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 16/04/25 00.09
@Last Modified 16/04/25 00.09
Version 1.0
*/

public class DetectingLowerCaseAndUpperCase {
    public static void main(String[] args) {
        String randomString = "As24@4FGasB%@lG25%16BIY(@a6l)";
        char[] chars = randomString.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                // print if character is uppercase
                System.out.println(chars[i] + " is uppercase");
            } else if (Character.isLowerCase(chars[i])) {
                // print if character is lowercase
                System.out.println(chars[i] + " is lowercase");
            } else {
                // print if character is not letter
                System.out.println(chars[i] + " is not letter");
            }
        }
    }
}
