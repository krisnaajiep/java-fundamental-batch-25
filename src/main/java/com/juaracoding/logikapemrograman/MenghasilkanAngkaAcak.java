package com.juaracoding.logikapemrograman;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 12/04/25 01.07
@Last Modified 12/04/25 01.07
Version 1.0
*/

import java.util.Random;

public class MenghasilkanAngkaAcak {

    public static void main(String[] args) {

        Random random = new Random();

        // Menghasilkan angka acak dari 1 - 10 sebanyak 5 kali
        for (int i = 0; i < 5; i++) {
            System.out.println(random.nextInt(1, 10));
        }

    }

}
