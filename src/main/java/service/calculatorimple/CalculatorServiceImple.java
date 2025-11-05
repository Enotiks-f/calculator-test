package service.calculatorimple;

import org.springframework.stereotype.Service;
import service.CalculatorService;

@Service
public class CalculatorServiceImple implements CalculatorService {

    public int CalculatePlus(int a, int b){
        return a+b;
    }

    public int CalculateMinus(int a, int b){
        return a-b;
    }

    public int CalculateMultiply(int a, int b){
        return a*b;
    }

    public int CalculateDivide(int a, int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Divide by zero");
        }
        return a/b;
    }

}
