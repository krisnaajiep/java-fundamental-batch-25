package com.juaracoding.oop.abstractclass;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 16/04/25 23.15
@Last Modified 16/04/25 23.15
Version 1.0
*/

/**
 * Subclass dari abstract class wajib mengimplementasikan seluuruh abstract method
 */
public class Square extends Shape {
    private final double side;

    public Square(double side) {
        super("Square");
        this.side = side;
    }

    // Override abstract method
    @Override
    public void calculateArea() {
        super.area = this.side * this.side;
    }

    // Override abstract method
    @Override
    public void calculatePerimeter() {
        super.perimeter = this.side * 4;
    }
}
