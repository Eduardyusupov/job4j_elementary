package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FactorialTest {

    @Test
    void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int expected = 120;
        int number = 5;
        int output = Factorial.calculateFactorial(number);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenCalculateFactorialForZeroThenOne() {
        int number = 0;
        int expected = 1;
        int output = Factorial.calculateFactorial(number);
        assertThat(output).isEqualTo(expected);
    }
}
