package com.juaracoding.stringobject;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 11/04/25 06.30
@Last Modified 11/04/25 06.30
Version 1.0
*/

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        // Area of Circle
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the radius: ");
            double radius = scanner.nextDouble();
            double result = Math.PI * radius * radius;
            System.out.println("Area of Circle is " + result);
        } catch (Exception e) {
            System.out.println("Input must be a number");
        } finally {
            scanner.close();
        }

    }

}
