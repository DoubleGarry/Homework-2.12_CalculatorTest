package pro.sky.homework_2_12_calculatortest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.homework_2_12_calculatortest.exception.DivideByZeroException;
import pro.sky.homework_2_12_calculatortest.service.CalculatorService;


public class CalculatorServiceTest {
    private CalculatorService calculatorService = new CalculatorService();

    @Test
    public void additionTest() {
        Number actual = calculatorService.addition(2, 2);
        Number expected = 4;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void subtractionTest() {
        Number actual = calculatorService.subtraction(3, 2);
        Number expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void multiplicationTest() {
        Number actual = calculatorService.multiplication(2, 2);
        Number expected = 4;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void divisionTest() {
        Number actual = calculatorService.division(2, 2);
        Number expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void divisionExceptionTest() {

        Assertions.assertThrows(DivideByZeroException.class, () -> calculatorService.division(5, 0));
    }

}
