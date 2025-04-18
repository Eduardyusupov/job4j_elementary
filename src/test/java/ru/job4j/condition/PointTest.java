package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.BDDAssertions.withPrecision;

public class PointTest {

    @Test
    void whenPoints50And20Then3() {
        int x1 = 5, y1 = 0, x2 = 2, y2 = 0;
        double expected = 3.0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus1Minus10And4And1Then12Dot08() {
        int x1 = -1, y1 = -10, x2 = 4, y2 = 1;
        double expected = 12.08;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus2Minus2dot7And2And2Then6Dot17() {
        double x1 = -2, y1 = -2.7, x2 = 2, y2 = 2;
        double expected = 6.17;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}
