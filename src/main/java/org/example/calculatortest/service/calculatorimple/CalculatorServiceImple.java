package org.example.calculatortest.service.calculatorimple;

import org.springframework.stereotype.Service;
import org.example.calculatortest.service.CalculatorService;

@Service
public class CalculatorServiceImple implements CalculatorService {

    public int calculatePlus(int a, int b){
        return a+b;
    }

    public int calculateMinus(int a, int b){
        return a-b;
    }

    public int calculateMultiply(int a, int b){
        return a*b;
    }

    public int calculateDivide(int a, int b) throws IllegalArgumentException{
        if(b==0){
            throw new ArithmeticException("Divide by zero");
        }
        return a/b;
    }

}
