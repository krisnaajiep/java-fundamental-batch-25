package com.juaracoding.method;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 12/04/25 03.47
@Last Modified 12/04/25 03.47
Version 1.0
*/

public class CreateMethod {

    public static void main(String[] args) {

        ucapkanSalam();
        sayHello("Krisna");
        sayHello("Ajie");
        sayHello("Prasetyo");

        System.out.println("70 Kilogram is " + convertKgToPound(70.0) + " Pound");

        CreateMethod createMethod = new CreateMethod();
        System.out.println("180 Centimeter is " + createMethod.convertCmToIn(180.0) + " Inch");

    }

    public double convertCmToIn(double valueCm) {
        return valueCm * 0.3937007874;
    }

    static void ucapkanSalam() {
        System.out.println("Selemat datang juara");
    }

    static void sayHello(String name) {
        System.out.println("Hello " + name );
    }

    static double convertKgToPound(double valueKg) {
        return valueKg * 2.2046226218;
    }

}
