package com.example.calculatortest.controller;

import com.example.calculatortest.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/plus")
    public String sum(@RequestParam int num1, @RequestParam int num2) {
        int result = calculatorService.sum(num1, num2);
        return resultString(num1, num2, result, '+');
    }

    @GetMapping("/minus")
    public String subtract(@RequestParam int num1, @RequestParam int num2) {
        int result = calculatorService.subtract(num1, num2);
        return resultString(num1, num2, result, '+');
    }

    @GetMapping("/divide")
    public String divide(@RequestParam int num1, @RequestParam int num2) {
        int result = calculatorService.divide(num1, num2);
        return resultString(num1, num2, result, '+');
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {
        int result = calculatorService.multiply(num1, num2);
        return resultString(num1, num2, result, '+');
    }

    private String resultString(int num1, int num2, int result, char c) {
        return String.format("%d %c %d = %d", num1, c, num2, result);
    }
}
