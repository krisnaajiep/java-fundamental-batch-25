package com.juaracoding.logikapemrograman;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 12/04/25 01.01
@Last Modified 12/04/25 01.01
Version 1.0
*/

import java.util.Scanner;

public class MendeteksiHurufVokalDanKonsonan {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan huruf: ");
            String letter = scanner.nextLine();

            if (
                    letter.equalsIgnoreCase("A") ||
                    letter.equalsIgnoreCase("I") ||
                    letter.equalsIgnoreCase("U") ||
                    letter.equalsIgnoreCase("E") ||
                    letter.equalsIgnoreCase("O")
            ) {
                System.out.println("Huruf " + letter + " adalah huruf vokal");
            } else {
                System.out.println("Huruf " + letter + " adalah huruf konsonan");
            }
        } catch (Exception e) {
            System.out.println(e.getClass().getName());
        } finally {
            scanner.close();
        }

    }

}
