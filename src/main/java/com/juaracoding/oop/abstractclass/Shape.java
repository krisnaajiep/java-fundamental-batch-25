package com.juaracoding.oop.abstractclass;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 16/04/25 23.07
@Last Modified 16/04/25 23.07
Version 1.0
*/

/**
 * Abstract Class
 * tidak bisa di instansiasi dan memiliki abstract method, namun juga bisa memiliki properti dan method biasa.
 * Abstract method tidak memiliki implementasi pada superclass dan wajib diimplementasikan oleh seluruh subclass,
 */
public abstract class Shape {
    private final String name;
    protected double area;
    protected double perimeter;

    public Shape(String name) {
        this.name = name;
    }

    /**
     * Abstract methods wajib di-override seluruh subclass
     */
    public abstract void calculateArea();
    public abstract void calculatePerimeter();

    public void showInfo() {
        System.out.println(this.name + " Area: " + this.area);
        System.out.println(this.name + " Perimeter: " + this.perimeter);
    }
}
