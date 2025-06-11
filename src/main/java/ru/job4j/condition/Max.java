package ru.job4j.condition;

public class Max {

    public static int max(int first, int second) {
        return (first > second) ? first : second;
    }

    public static int max(int first, int second, int third) {
        int max = max(first, second);
        return (third > max) ? third : max;
    }

    public static int max(int first, int second, int third, int fourth) {
        int max = max(first, second, third);
        return (fourth > max) ? fourth : max;
    }
}
