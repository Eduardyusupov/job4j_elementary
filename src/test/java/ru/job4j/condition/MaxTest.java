package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MaxTest {

    @Test
    void whenSecondOverFirst() {
        int first = 5;
        int second = 10;
        int result = Max.max(first, second);
        int expected = 10;
        assertThat(expected).isEqualTo(result);
    }

    @Test
    void whenThirdOverFirstAndSecond() {
        int first = 5;
        int second = 10;
        int third = 15;
        int result = Max.max(first, second, third);
        int expected = 15;
        assertThat(expected).isEqualTo(result);
    }

    @Test
    void whenThirdOverFirstSecondAndFourth() {
        int first = 5;
        int second = 10;
        int third = 15;
        int fourth = 12;
        int result = Max.max(first, second, third, fourth);
        int expected = 15;
        assertThat(expected).isEqualTo(result);
    }

}
