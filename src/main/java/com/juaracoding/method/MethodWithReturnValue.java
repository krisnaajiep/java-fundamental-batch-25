package com.juaracoding.method;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 12/04/25 04.33
@Last Modified 12/04/25 04.33
Version 1.0
*/

import java.util.Random;

public class MethodWithReturnValue {
    /**
     *
     * @return int
     */
    int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(100);
    }
}
