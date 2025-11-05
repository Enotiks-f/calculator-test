package org.example.calculatortest.service;

public interface CalculatorService {
    public int calculatePlus(int a, int b);
    public int calculateMinus(int a, int b);
    public int calculateMultiply(int a, int b);
    public int calculateDivide(int a, int b) throws ArithmeticException;
}
