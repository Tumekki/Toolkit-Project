package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {
    @Test
    void test(){
        Converter converter = new Converter();
        double expected = 50.0;
        double actual = converter.toFahrenheit(10.0);
        assertEquals(expected, actual);
    }
}