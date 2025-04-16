package com.juaracoding.oop.inheritance;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 16/04/25 04.36
@Last Modified 16/04/25 04.36
Version 1.0
*/

/**
 * Child class dari Product
 * tidak perlu membuat ulang properti dan method yang ada pada class Product karena:
 * properti name, price, dan quantity sudah didefinisikan di Parent class (Product)
 * method setter dan getter untuk properti pada Parent class juga sudah didefinisikan
 */
public class Movie extends Product {
    private String director;
    private String producer;
    private String genre;

    public Movie(String name, int price, int quantity, String director, String producer, String genre) {
        super(name, price, quantity); // Keyword super untuk memanggil constructor Parent class
        this.director = director;
        this.producer = producer;
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public void printInfo() {
        super.printInfo(); // keyword super untuk memanggil method printInfo() pada Parent class
        System.out.println("Director: " + director);
        System.out.println("Producer: " + producer);
        System.out.println("Genre: " + genre);
    }
}
