package pro.sky.homework_2_12_calculatortest.controller;

import org.springframework.web.bind.annotation.*;
import pro.sky.homework_2_12_calculatortest.exception.DivideByZeroException;
import pro.sky.homework_2_12_calculatortest.service.CalculatorService;

@RestController

@RequestMapping(value = "/calculator")
public class CalculatorController {
    private CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String hello() {
        return calculatorService.hello();
    }

    @GetMapping(path = "/plus")
    public String addition(@RequestParam("num1") Integer num1,
                           @RequestParam("num2") Integer num2) {
        return num1 + "+" + num2 + "=" + calculatorService.addition(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String subtraction(@RequestParam("num1") Integer num1,
                              @RequestParam("num2") Integer num2) {
        return num1 + "-" + num2 + "=" + calculatorService.subtraction(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String multiplication(@RequestParam("num1") Integer num1,
                                 @RequestParam("num2") Integer num2) {
        return num1 + "х" + num2 + "=" + calculatorService.multiplication(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String division(@RequestParam("num1") Integer num1,
                           @RequestParam("num2") Integer num2) {
        return num1 + "/" + num2 + "=" + calculatorService.division(num1, num2);
    }

    @ExceptionHandler({DivideByZeroException.class})
    public String zeroException() {
        return "Делить на ноль нельзя";
    }
}
