/*
B221202076
Muhammed Yasir Polat
Software Verification and Validation
Homework 1
https://github.com/MYasirPolat/SVV
 */

package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @ParameterizedTest
    @CsvSource({"10,2,5","10,4,2.5" ,"12.5f,2.5f,5","10,2.5f,4","12.5f,5,2.5f","12.5,0,"})
    void testDivisions(Float num1, Float num2, Float expected) {
        if(num2==0) assertThrows(IllegalArgumentException.class, () -> Calculator.divide(num1, num2),"IllegalArgumentException");
        else assertEquals(expected,Calculator.divide(num1,num2),"Division failed.");

    }
}
