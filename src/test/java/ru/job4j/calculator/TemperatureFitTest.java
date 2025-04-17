package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.BDDAssertions.withPrecision;

public class TemperatureFitTest {

    @Test
    void whenRoomTemperature10ThenFruits3() {
        int input = 10;
        double expected = 3.0;
        double output = TemperatureFit.idealTemperatureForFruits(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenRoomTemperature10ThenMeatMinus2() {
        int input = 10;
        double expected = -2.0;
        double output = TemperatureFit.idealTemperatureForMeat(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}
