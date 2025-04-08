package com.juaracoding;

/*
IntelliJ IDEA 2024.3.4.1 (Community Edition)
Build #IC-243.25659.59, built on March 5, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 08/04/25 20.41
@Last Modified 08/04/25 20.41
Version 1.0
*/

import java.util.Random;
import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        if (false) {
            System.out.println("Statement");
        }

        System.out.println("Next Statement");

        int number = 0;

        if (number % 2 == 0) {
            System.out.println("Genap");
        } else if (number % 2 == 1) {
            System.out.println("Ganjil");
        }

        // Login with Username, Password, and OTP
        System.out.println("\nLogin User");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        if (!username.equals("admin") || !password.equals("password")) {
            System.out.println("\nWrong username or password");
        } else {
            Random random = new Random();
            int otp = random.nextInt(1000, 9999);
            System.out.println("\nOTP: " + otp);
            System.out.print("\nEnter OTP: ");
            String otpInput = scanner.nextLine();

            if (!otpInput.isBlank() && Integer.parseInt(otpInput) == otp) {
                System.out.println("\nLogin Success");
            } else {
                System.out.println("\nWrong OTP");
                System.out.println("Login failed");
            }
        }

        scanner.close();

        // Ternary Operation
        System.out.println("\nTernary Operation");
        int score = 80;
        boolean pass = score > 70 ? true : false;
        System.out.println(pass);
    }
}
