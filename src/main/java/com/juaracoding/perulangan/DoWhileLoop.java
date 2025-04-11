package com.juaracoding.perulangan;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 11/04/25 19.33
@Last Modified 11/04/25 19.33
Version 1.0
*/

import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            boolean loop = false;

            // Enter Password
            do {
                System.out.print("Enter password: ");
                String password = scanner.nextLine();
                if (password == null || !password.equals("password")) {
                    System.out.println("Invalid password!");
                    loop = true;
                } else {
                    System.out.println("You have entered the correct password!");
                    loop = false;
                }
            } while (loop);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }

    }

}
