package service;

public interface CalculatorService {
    public int CalculatePlus(int a, int b);
    public int CalculateMinus(int a, int b);
    public int CalculateMultiply(int a, int b);
    public int CalculateDivide(int a, int b) throws ArithmeticException;
}
