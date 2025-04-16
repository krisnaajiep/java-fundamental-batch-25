package com.juaracoding.oop.modifier.in;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 16/04/25 01.01
@Last Modified 16/04/25 01.01
Version 1.0
*/

/**
 * protected modifier
 * berarti properti atau metode dapat diakses:
 * di dalam class yang sama,
 * di dalam package yang sama,
 * dan di luar jika hanya subclass dari class ini
 */
public class ProtectedModifier {
    /**
     * protected attribute
     */
    protected String attr;

    /**
     * protected method
     */
    protected void setAttr(String attr) {
        this.attr = attr;
    }
}
