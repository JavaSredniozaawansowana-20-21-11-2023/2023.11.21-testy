package com.comarch.szkolenia.testy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    //@Disabled
    public void twoPositivesMultiplicationTest() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 4;
        int expected = 20;

        int actual = calculator.multiply(a, b);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void twoNegativesMultiplicationTest() {
        Calculator calculator = new Calculator();
        int a = -5;
        int b = -4;
        int expected = 20;

        int actual = calculator.multiply(a, b);

        Assertions.assertEquals(expected, actual);
    }
}
