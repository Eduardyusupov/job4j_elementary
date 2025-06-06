package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CounterTest {

    @Test
    void whenStart13AndFinish18Then93() {
        int start = 13;
        int finish = 18;
        int expected = 93;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStart10AndFinish5Then0() {
        int start = 10;
        int finish = 5;
        int expected = 0;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStart2AndFinish8Then14() {
        int start = 2;
        int finish = 8;
        int expected = 20;
        int output = Counter.sumByEven(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStartMinus2AndFinish8Then18() {
        int start = -2;
        int finish = 8;
        int expected = 18;
        int output = Counter.sumByEven(start, finish);
        assertThat(output).isEqualTo(expected);
    }
}
