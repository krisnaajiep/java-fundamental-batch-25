package com.juaracoding.logikapemrograman;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 12/04/25 01.09
@Last Modified 12/04/25 01.09
Version 1.0
*/

public class MathematicalMethods {

    public static void main(String[] args) {

        // Math.sqrt()
        // Menghitung akar kuadrat dari suatu bilangan
        double sqrt = Math.sqrt(256.0);
        System.out.println("Math.sqrt(256.0): " + sqrt); // √256 = 16.0

        // Math.pow()
        // Menghitung pangkat dari suatu bilangan
        double pow = Math.pow(2.0, 4.0);
        System.out.println("Math.pow(2.0, 4.0): " + pow); // 2^4 = 16.0

        // Math.sin()
        // Menghitung nilai sinus dari sebuah sudut
        double sin = Math.sin(90 * (Math.PI / 180));
        System.out.println("Math.sin(90 * (Math.PI / 180)): " + sin); // sin(90°) = 1.0

        // Math.cos()
        // Menghitung nilai cosinus dari sebuah sudut
        double cos = Math.cos(0 * (Math.PI / 180));
        System.out.println("Math.cos(0 * (Math.PI / 180)): " + cos); // cos(0°) = 1.0

        // Math.tan()
        // Menghitung nilai tangen dari sebuah sudut
        double tan = Math.tan(45 * (Math.PI / 180));
        System.out.println("Math.tan(45 * (Math.PI / 180)): " + tan); // tan(45°) = 0.99999

        // Math.round()
        // Membulatkan angka ke bilangan bulat terdekat
        long round1 = Math.round(.550);
        long round2 = Math.round(.450);
        System.out.println("Math.round(0.550): " + round1); // round(0.550) = 1
        System.out.println("Math.round(0.450): " + round2); // round(0.450) = 0

        // Math.ceil()
        // Membulatkan angka ke atas
        double ceil = Math.ceil(.250);
        System.out.println("Math.ceil(0.250): " + ceil); // ceil(0.250) = 1.0

        // Math.floor()
        // Membulatkan angka ke bawah
        double floor = Math.floor(.750);
        System.out.println("Math.floor(0.750): " + floor); // floor(0.750) = 0.0

        // Math.toRadians()
        // Mengonversi derajat ke radian
        double radian = Math.toRadians(45);
        System.out.println("Math.toRadians(45): " + radian); // 45° * π/180 = 0.78539

        // Math.toDegree()
        // Mengonversi radian ke derajat
        double degree = Math.toDegrees(radian);
        System.out.println("Math.toDegrees(45): " + degree); // 0.78539 * 180/π = 45°

        // Math.abs()
        // Mengubah nilai negatif menjadi positif
        int positive = Math.abs(-10);
        System.out.println("Math.abs(-10): " + positive); // -10 = 10

        // Math.max()
        // Mendapatkan angka tertinggi dari sebuah pasangan angka
        int max = Math.max(10, 20);
        System.out.println("Math.max(10, 20): " + max); // 20

        // Math.min()
        // Mendapatkan angka terendah dari sebuah pasangan angka
        int min = Math.min(10, 20);
        System.out.println("Math.min(10, 20): " + min); // 10

        // Math.exp()
        // Menghitung nilai eksponensial dari e berdasarkan pangkat tertentu
        double exp = Math.exp(2.0);
        System.out.println("Math.exp(2.0): " + exp); // e^2 = 7.38905609893065

        // Math.log()
        // Menghitung logaritma natural
        double log = Math.log(exp); // Math.log(Math.exp(2.0))
        System.out.println("Math.log(Math.exp(2.0)): " + log); // ln(e^2) = 2.0

        // Math.log10()
        // Menghitung logaritma basis 10
        double log10 = Math.log10(1000000);
        System.out.println("Math.log10(1000000): " + log10); // log10(1000000) = 6

    }

}
