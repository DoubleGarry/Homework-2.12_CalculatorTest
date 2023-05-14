package pro.sky.homework_2_12_calculatortest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.homework_2_12_calculatortest.service.CalculatorService;

import java.util.stream.Stream;


public class CalculatorServiceParameterizedTest {
    private CalculatorService calculatorService = new CalculatorService();

    public static Stream<Arguments> ParamsPlusTest() {
        return Stream.of(
                Arguments.of(2, 2, 4),
                Arguments.of(5, 5, 10),
                Arguments.of(4, 4, 8));
    }

    @ParameterizedTest
    @MethodSource("ParamsPlusTest")
    public void checkPlusTest(int num1, int num2, int result) {
        Assertions.assertEquals(result, calculatorService.addition(num1, num2));
    }

    public static Stream<Arguments> ParamsMinusTest() {
        return Stream.of(
                Arguments.of(2, 2, 0),
                Arguments.of(5, 5, 0),
                Arguments.of(4, 3, 1));
    }

    @ParameterizedTest
    @MethodSource("ParamsMinusTest")
    public void checkMinusTest(int num1, int num2, int result) {
        Assertions.assertEquals(result, calculatorService.subtraction(num1, num2));
    }

    public static Stream<Arguments> ParamsMultiplyTest() {
        return Stream.of(
                Arguments.of(2, 2, 4),
                Arguments.of(5, 5, 25),
                Arguments.of(4, 4, 16));
    }

    @ParameterizedTest
    @MethodSource("ParamsMultiplyTest")
    public void checkMultiplyTest(int num1, int num2, int result) {
        Assertions.assertEquals(result, calculatorService.multiplication(num1, num2));
    }

    public static Stream<Arguments> ParamsDivideTest() {
        return Stream.of(
                Arguments.of(2, 2, 1),
                Arguments.of(10, 5, 2),
                Arguments.of(16, 4, 4));
    }

    @ParameterizedTest
    @MethodSource("ParamsDivideTest")
    public void checkDivideTest(int num1, int num2, int result) {
        Assertions.assertEquals(result, calculatorService.division(num1, num2));
    }
}
