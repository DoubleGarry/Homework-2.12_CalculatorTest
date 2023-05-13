package pro.sky.homework_2_12_calculatortest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.homework_2_12_calculatortest.service.CalculatorService;

public class CalculatorServiceTest {
    private CalculatorService calculatorService = new CalculatorService();

    @Test
    public void plusTest() {
        Number actual = calculatorService.addition(2, 2);
        Number expected = 4;

        Assertions.assertEquals(expected, actual);
    }

}
