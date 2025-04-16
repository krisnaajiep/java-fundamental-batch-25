package com.juaracoding.oop.abstractclass;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 16/04/25 23.22
@Last Modified 16/04/25 23.22
Version 1.0
*/

/**
 * Subclass dari abstract class wajib mengimplementasikan seluuruh abstract method
 */
public class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    // Override abstract method
    @Override
    public void calculateArea() {
        super.area = Math.PI * radius * radius;
    }

    // Override abstract method
    @Override
    public void calculatePerimeter() {
        super.perimeter = 2 * Math.PI * radius;
    }
}
