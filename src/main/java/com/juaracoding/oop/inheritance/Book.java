package com.juaracoding.oop.inheritance;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 16/04/25 04.35
@Last Modified 16/04/25 04.35
Version 1.0
*/

/**
 * Child class dari Product
 * tidak perlu membuat ulang properti dan method yang ada pada class Product karena:
 * properti name, price, dan quantity sudah didefinisikan di Parent class (Product)
 * method setter dan getter untuk properti pada Parent class juga sudah didefinisikan
 */
public class Book extends Product {
    private String author;
    private String publisher;
    private int pages;

    public Book(String name, int price, int quantity, String author, String publisher, int pages) {
        super(name, price, quantity); // Keyword super untuk memanggil constructor Parent class
        this.author = author;
        this.publisher = publisher;
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public void printInfo() {
        super.printInfo(); // keyword super untuk memanggil method printInfo() pada Parent class
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("ISBN: " + pages);
    }
}
