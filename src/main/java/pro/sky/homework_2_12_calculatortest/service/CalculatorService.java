package pro.sky.homework_2_12_calculatortest.service;

import org.springframework.stereotype.Service;
import pro.sky.homework_2_12_calculatortest.exception.DivideByZeroException;

@Service
public class CalculatorService {

    public CalculatorService() {
    }

    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    public int addition(Integer num1, Integer num2) {
        return num1 +num2;
    }

    public int subtraction(Integer num1, Integer num2) {
        return num1 - num2;
    }

    public int multiplication(Integer num1, Integer num2) {
        return num1 * num2;
    }

    public int division(Integer num1, Integer num2) {
        if (num2 == 0) {
            throw new DivideByZeroException();
        }
        return num1 / num2;
    }
}
