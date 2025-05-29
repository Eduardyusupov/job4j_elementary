package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.BDDAssertions.withPrecision;

public class PointTest {

    @Test
    void whenPoints50And20Then3() {
        Point pointOne = new Point(5, 0);
        Point pointTwo = new Point(2, 0);
        double expected = 3.0;
        double output = pointOne.distance(pointTwo);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus1Minus10And4And1Then12Dot08() {
        Point pointOne = new Point(-1, -10);
        Point pointTwo = new Point(4, 1);
        double expected = 12.08;
        double output = pointOne.distance(pointTwo);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus2Minus2dot7And2And2Then6Dot17() {
        Point pointOne = new Point(-2, -2.7);
        Point pointTwo = new Point(2, 2);
        double expected = 6.17;
        double output = pointOne.distance(pointTwo);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointTwoFiveFourAndFiveSixSeven() {
        Point c = new Point(2, 5, 4);
        Point d = new Point(5, 6, 7);
        double expected = 4.35;
        double output = c.distance3d(d);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}
