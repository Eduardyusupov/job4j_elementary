package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.BDDAssertions.withPrecision;

public class RectangleTest {

    @Test
    void whenLength7AndWidth8ThenDiagona10dot63() {
        double length = 7;
        double width = 8;
        double expected = 10.63;
        double output = Rectangle.diagonal(length, width);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenLength10AndWidth15ThenDiagonal18dot02() {
        double length = 10;
        double width = 15;
        double expected = 18.02;
        double output = Rectangle.diagonal(length, width);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenLength9AndWidth24ThenDiagonal25dot63() {
        double length = 9;
        double width = 24;
        double expected = 25.63;
        double output = Rectangle.diagonal(length, width);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

}
