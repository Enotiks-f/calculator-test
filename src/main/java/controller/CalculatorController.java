package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.calculatorimple.CalculatorServiceImple;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    CalculatorServiceImple calculatorServiceImple;

    public CalculatorController(CalculatorServiceImple calculatorServiceImple) {
        this.calculatorServiceImple = calculatorServiceImple;
    }

    @GetMapping("/plus")
    public int plus(@RequestParam int a, @RequestParam int b) {
        return calculatorServiceImple.CalculatePlus(a, b);
    }

    @GetMapping("/minus")
    public int minus(@RequestParam int a, @RequestParam int b) {
        return calculatorServiceImple.CalculateMinus(a, b);
    }

    @GetMapping("/multiply")
    public int multiply(@RequestParam int a, @RequestParam int b) {
        return calculatorServiceImple.CalculateMultiply(a, b);
    }

    @GetMapping("/divide")
    public int divide(@RequestParam int a, @RequestParam int b) {
        return calculatorServiceImple.CalculateDivide(a, b);
    }
}
