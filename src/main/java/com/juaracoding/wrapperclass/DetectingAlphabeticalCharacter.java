package com.juaracoding.wrapperclass;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 16/04/25 00.07
@Last Modified 16/04/25 00.07
Version 1.0
*/

public class DetectingAlphabeticalCharacter {
    public static void main(String[] args) {
        String randomString = "jdaT)DW240Lda0D+_@,zmx";
        char[] chars = randomString.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            // print if character is alphabetic
            if (Character.isAlphabetic(chars[i])) {
                System.out.println(chars[i] + " is alphabetic");
            }
        }
    }
}
