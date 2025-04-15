package com.juaracoding.logikapemrograman;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 12/04/25 00.57
@Last Modified 12/04/25 00.57
Version 1.0
*/

import java.util.Scanner;

public class MendeteksiBilanganGanjilDanGenap {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan angka: ");
            int number = scanner.nextInt();

            if (number % 2 == 0) {
                System.out.println("Angka " + number + " adalah bilangan genap");
            } else {
                System.out.println("Angka " + number + " adalah bilangan ganjil");
            }
        } catch (Exception e) {
            System.out.println(e.getClass().getName());
        } finally {
            scanner.close();
        }

    }

}
