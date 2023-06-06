package com.example.calculatortest.service;

import com.example.calculatortest.NumbersConstants;
import org.junit.jupiter.api.Test;

import static com.example.calculatortest.NumbersConstants.*;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {

    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    @Test
    public void shouldReturnCorrectSum1() {
        assertEquals(ONE + THREE, calculatorService.sum(ONE, THREE));
    }
    public void shouldReturnCorrectSum2() {
        assertEquals(THREE + THREE, calculatorService.sum(THREE, THREE));
    }

    @Test
    public void shouldReturnCorrectSubtract1() {
        assertEquals(THREE - TWO, calculatorService.subtract(THREE, TWO));
    }

    public void shouldReturnCorrectSubtract2() {
        assertEquals(THREE - ONE, calculatorService.subtract(THREE, ONE));
    }

    @Test
    public void shouldReturnCorrectDivide1() {
        assertEquals(THREE / TWO, calculatorService.divide(THREE, TWO));
    }

    @Test
    public void shouldReturnCorrectDivide2() {
        assertEquals(TWO / TWO, calculatorService.divide(TWO, TWO));
    }

    @Test
    public void shouldReturnCorrectMultiply1() {
        assertEquals(TWO * TWO, calculatorService.multiply(TWO, TWO));
    }

    @Test
    public void shouldReturnCorrectMultiply2() {
        assertEquals(THREE * THREE, calculatorService.multiply(THREE, THREE));
    }

    @Test
    public void shouldThrowZeroDivideExeption() {
        assertThrows(IllegalArgumentException.class, () -> calculatorService.divide(TWO, ZERO));
    }




}