package com.juaracoding.logikapercabangan;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 11/04/25 07.23
@Last Modified 11/04/25 07.23
Version 1.0
*/

public class NestedIfElseStatement {

    public static void main(String[] args) {

        boolean isLoggedIn = true;
        String role = "user";

        if (isLoggedIn) {
            if (role.equals("admin")) {
                System.out.println("Welcome back, Admin.");
            } else {
                System.out.println("Welcome Back, User.");
            }
        } else {
            System.out.println("Please login first.");
        }

    }

}
