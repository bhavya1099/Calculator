package com.houarizegai.calculator.ui;

import com.houarizegai.calculator.CalculatorUI;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorUI_calculate_755b65b191_Test {
    private CalculatorUI calculatorUI;

    @BeforeEach
    public void setUp() {
        calculatorUI = new CalculatorUI();
    }

    @Test
    public void testCalculate_Addition() {
        assertEquals(9.0, calculatorUI.calculate(4, 5, '+'));
    }

    @Test
    public void testCalculate_Subtraction_FirstNumberGreaterThanSecondNumber() {
        assertEquals(5.0, calculatorUI.calculate(10, 5, '-'));
    }

    @Test
    public void testCalculate_Subtraction_SecondNumberGreaterThanFirstNumber() {
        assertEquals(-3.0, calculatorUI.calculate(2, 5, '-'));
    }

    @Test
    public void testCalculate_Multiplication() {
        assertEquals(15.0, calculatorUI.calculate(3, 5, '*'));
    }

    @Test
    public void testCalculate_Division_FirstNumberGreaterThanSecondNumber() {
        assertEquals(2.0, calculatorUI.calculate(10, 5, '/'));
    }

    @Test
    public void testCalculate_Division_SecondNumberGreaterThanFirstNumber() {
        assertEquals(0.5, calculatorUI.calculate(5, 10, '/'));
    }

    @Test
    public void testCalculate_Division_ByZero() {
        assertEquals(Double.POSITIVE_INFINITY, calculatorUI.calculate(5, 0, '/'));
    }

    @Test
    public void testCalculate_Modulus() {
        assertEquals(1.0, calculatorUI.calculate(10, 3, '%'));
    }

    @Test
    public void testCalculate_Power() {
        assertEquals(8.0, calculatorUI.calculate(2, 3, '^'));
    }

    @Test
    public void testCalculate_InvalidOperator() {
        assertEquals(3.0, calculatorUI.calculate(2, 3, 'a'));
    }
}
