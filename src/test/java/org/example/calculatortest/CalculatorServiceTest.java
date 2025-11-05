package org.example.calculatortest;


import org.example.calculatortest.service.CalculatorService;
import org.example.calculatortest.service.calculatorimple.CalculatorServiceImple;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceTest {

    private CalculatorServiceImple calculatorServiceImple;

    @BeforeEach
    public void init(){
        calculatorServiceImple = new CalculatorServiceImple();

    }

    @Test
    public void CalculatorPlusTest(){
        int result = calculatorServiceImple.calculatePlus(3, 5);
    }

    @Test
    public void CalculatorMinusTest(){
        int result = calculatorServiceImple.calculateMinus(3, 5);

    }

    @Test
    public void CalculatorMultiplyTest(){
        int result = calculatorServiceImple.calculateMultiply(3, 5);
    }

    @Test
    public void CalculatorDivideTest(){
        int result = calculatorServiceImple.calculateDivide(3, 5);
    }

    @Test
    public void divide_ByZero_ThrowsArithmeticException(){
        assertThrows(ArithmeticException.class, () -> calculatorServiceImple.calculateDivide(10, 0));
    }
}
