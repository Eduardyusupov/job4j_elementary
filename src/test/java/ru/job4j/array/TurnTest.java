package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class TurnTest {
    @Test
    void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = {4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expected = {2, 6, 1, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = {1, 2, 3, 4, 5};
        int[] result = Turn.back(input);
        int[] expected = {5, 4, 3, 2, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenTurnEvenArray() {
        int[] input = {4, 1, 6, 2, 10, 38, 34, 98};
        int[] result = Turn.back(input);
        int[] expected = {98, 34, 38, 10, 2, 6, 1, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenTurnOddArray() {
        int[] input = {4, 1, 6, 2, 10, 38, 34};
        int[] result = Turn.back(input);
        int[] expected = {34, 38, 10, 2, 6, 1, 4};
        assertThat(result).containsExactly(expected);
    }
}
