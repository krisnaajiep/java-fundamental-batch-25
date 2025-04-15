package com.juaracoding.wrapperclass;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 15/04/25 23.58
@Last Modified 15/04/25 23.58
Version 1.0
*/

public class DetectingNumericalCharacter {
    public static void main(String[] args) {
        String randomString = "<>#$@DADda241dav*955>{ad}:76";
        char[] chars = randomString.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            // print if character is digit
            if (Character.isDigit(chars[i])) {
                System.out.println(chars[i] + " is a number.");
            }
        }
    }
}
