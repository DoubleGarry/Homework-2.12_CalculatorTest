package pro.sky.homework_2_12_calculatortest.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    private ValidationService validationService;

    public CalculatorService(ValidationService validationService) {
        this.validationService = validationService;
    }

    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    public int addition(Integer num1, Integer num2) {
        return validationService.checkNull(num1) + validationService.checkNull(num2);
    }

    public int subtraction(Integer num1, Integer num2) {
        return validationService.checkNull(num1) - validationService.checkNull(num2);
    }

    public int multiplication(Integer num1, Integer num2) {
        return validationService.checkNull(num1) * validationService.checkNull(num2);
    }

    public int division(Integer num1, Integer num2) {
        return validationService.checkNull(num1)
                / validationService.checkZero(validationService.checkNull(num2));
    }
}
