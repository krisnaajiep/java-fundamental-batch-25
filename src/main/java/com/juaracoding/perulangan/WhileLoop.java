package com.juaracoding.perulangan;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 11/04/25 08.10
@Last Modified 11/04/25 08.10
Version 1.0
*/

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            boolean loop = true;

            // Guess number
            while (loop) {
                System.out.print("Guess the number (1 - 10): ");
                int guess = scanner.nextInt();
                int randomNumber = (int) (Math.random() * 10);
                if (randomNumber == guess) {
                    System.out.println("You guessed the number!");
                } else {
                    System.out.println("You lost the number!");
                    System.out.println("Number is " + randomNumber);
                }
                System.out.print("Try again (Y/N): ");
                String answer = scanner.next();
                if (answer.equalsIgnoreCase("N")) {
                    loop = false;
                }
            }
        } catch (Exception e) {
            System.out.println("Invalid input!");
        } finally {
            System.out.println("Thank you!");
            scanner.close();
        }

    }

}
