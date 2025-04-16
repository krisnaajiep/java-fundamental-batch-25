package com.juaracoding.oop.inheritance;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 16/04/25 04.24
@Last Modified 16/04/25 04.24
Version 1.0
*/

public class InheritanceMain {
    public static void main(String[] args) {
        System.out.println("Book");
        Product book = new Book(
                "Rekayasa Perangkat Lunak",
                40000,
                20,
                "Raden Budiarto Hadiprakoso",
                "RBH",
                408);
        book.printInfo();

        System.out.println("\nMovie");
        Product movie = new Movie(
                "The Godfather",
                100000,
                50,
                "Francis Ford Coppola",
                "Albert S. Ruddy",
                "Gangster");
        movie.printInfo();
    }
}
