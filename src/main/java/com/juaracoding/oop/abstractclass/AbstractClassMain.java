package com.juaracoding.oop.abstractclass;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 16/04/25 05.02
@Last Modified 16/04/25 05.02
Version 1.0
*/

public class AbstractClassMain {
    public static void main(String[] args) {
//        Shape shape = new Shape(); // abstract class tidak dapat di instansiasi

        double side = 5;
        Shape square = new Square(side);
        System.out.println("Square Side: " + side);
        square.calculateArea();
        square.calculatePerimeter();
        square.showInfo();

        System.out.println();

        Shape circle = new Circle(side);
        System.out.println("Circle Side: " + side);
        circle.calculateArea();
        circle.calculatePerimeter();
        circle.showInfo();
    }
}
