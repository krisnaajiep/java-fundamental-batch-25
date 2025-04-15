package com.juaracoding.logikapemrograman;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 12/04/25 00.49
@Last Modified 12/04/25 00.49
Version 1.0
*/

import java.util.Scanner;

public class MenghitungLuasSegitiga {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan panjang alas segitiga: ");
            double base = scanner.nextDouble();
            System.out.print("Masukkan tinggi segitiga: ");
            double height = scanner.nextDouble();
            double area = (base * height) / 2;
            System.out.println("Luas: " + area);
        } catch (Exception e) {
            System.out.println(e.getClass().getName());
        } finally {
            scanner.close();
        }

    }

}
