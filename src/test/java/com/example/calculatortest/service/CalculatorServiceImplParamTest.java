package com.example.calculatortest.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.example.calculatortest.NumbersConstants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorServiceImplParamTest {

    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    @MethodSource("params")
    @ParameterizedTest
    public void shouldReturnCorrectSum1(int num1, int num2) {
        assertEquals(num1 + num2, calculatorService.sum(num1, num2));
    }

    @MethodSource("params")
    @ParameterizedTest
    public void shouldReturnCorrectSubtract1(int num1, int num2) {
        assertEquals(num1 - num2, calculatorService.subtract(num1, num2));
    }

    @MethodSource("params")
    @ParameterizedTest
    public void shouldReturnCorrectDivide1(int num1, int num2) {
        assertEquals(num1 / num2, calculatorService.divide(num1, num2));
    }

    @MethodSource("params")
    @ParameterizedTest
    public void shouldReturnCorrectMultiply1(int num1, int num2) {
        assertEquals(num1 * num2, calculatorService.multiply(num1, num2));
    }

    private static Stream<Arguments> params() {
        return Stream.of(
                Arguments.of(ZERO, ONE),
                Arguments.of(TWO, ONE),
                Arguments.of(ONE, THREE),
                Arguments.of(TWO, TWO),
                Arguments.of(THREE, TWO)
        );
    }


}