package com.juaracoding.logikapemrograman;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 12/04/25 02.38
@Last Modified 12/04/25 02.38
Version 1.0
*/

public class ComparingFloatingPointNumbers {

    public static void main(String[] args) {

        double v = 2.0;
        double sqrt = Math.sqrt(v);
        double pow = Math.pow(sqrt, 2.0); // 2.0000000000000004
        double d = pow - v;

        if (d == 0) {
            System.out.println("sqrt(2) squared minus 2 is 0");
        } else {
            System.out.println("sqrt(2) squared minus 2 is not 0 but " + d);
        }

    }

}
