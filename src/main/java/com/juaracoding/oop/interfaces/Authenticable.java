package com.juaracoding.oop.interfaces;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 17/04/25 00.04
@Last Modified 17/04/25 00.04
Version 1.0
*/

/**
 * Interface
 * dapat berisi konstanta dan abstract method,
 * jika ingin mengimplementasikan method di dalam interface maka harus static/default/private
 */
public interface Authenticable {
    /**
     * Abstract method
     */
    void login(String username, String password);

    /**
     * Abstract method
     */
    void logout();
}
