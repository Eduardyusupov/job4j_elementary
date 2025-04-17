package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class VectorTest {

    @Test
    void whenVectorsMinus46AndMinus34ThenResultMinus710() {
        int x1 = -4, y1 = -6, x2 = -3, y2 = -4;
        String expected = "(-7, -10)";
        String output = Vector.addVectors(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenVectors52And87ThenResult139() {
        int x1 = 5, y1 = 2, x2 = 8, y2 = 7;
        String expected = "(13, 9)";
        String output = Vector.addVectors(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected);
    }

}
