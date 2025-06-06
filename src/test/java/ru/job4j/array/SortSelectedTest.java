package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3IndexArray() {
        int[] data = {8, 5, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = {1, 5, 8};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort5IndexArray() {
        int[] data = {9, 73, 5, 3, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = {1, 3, 5, 9, 73};
        assertThat(result).containsExactly(expected);
    }

}