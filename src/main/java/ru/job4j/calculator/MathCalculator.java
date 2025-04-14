package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumTwoOperationsSubsctractionAndDivision(double first, double second) {
        return substraction(first, second) + division(first, second);
    }

    public static double sumArithmeticOperations(double first, double second) {
        return sum(first, second) + multiply(first, second) + substraction(first, second) + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + sumTwoOperationsSubsctractionAndDivision(10, 20));
        System.out.println("Результат расчета равен: " + sumArithmeticOperations(10, 20));
    }
}
