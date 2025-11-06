package org.example.calculatortest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.example.calculatortest.service.calculatorimple.CalculatorServiceImple;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    CalculatorServiceImple calculatorServiceImple;

    public CalculatorController(CalculatorServiceImple calculatorServiceImple) {
        this.calculatorServiceImple = calculatorServiceImple;
    }

    @GetMapping("/plus")
    public int calculatorpPlus(@RequestParam int a, @RequestParam int b) {
        return calculatorServiceImple.calculatePlus(a, b);
    }

    @GetMapping("/minus")
    public int calculatorMinus(@RequestParam int a, @RequestParam int b) {
        return calculatorServiceImple.calculateMinus(a, b);
    }

    @GetMapping("/multiply")
    public int calculatorMultiply(@RequestParam int a, @RequestParam int b) {
        return calculatorServiceImple.calculateMultiply(a, b);
    }

    @GetMapping("/divide")
    public int calculatorDivide(@RequestParam int a, @RequestParam int b) {
        return calculatorServiceImple.calculateDivide(a, b);
    }
}
