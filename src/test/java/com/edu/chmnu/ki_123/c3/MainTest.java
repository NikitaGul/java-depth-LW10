package com.edu.chmnu.ki_123.c3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void binarySearch1() {
        double[] array = {2.4, 2.6, 2.7, 5.7, 7.8, 9.6};

        assertEquals(2, Main.binarySearch(array, 2.7));
    }

    @Test
    void binarySearch2() {
        double[] array = {2.4, 2.6, 2.7, 5.7, 7.8, 9.6};

        assertEquals(-1, Main.binarySearch(array, 5.6));
    }

    @Test
    void binarySearch3() {
        double[] array = {5.7};

        assertEquals(0, Main.binarySearch(array, 5.7));
    }
}