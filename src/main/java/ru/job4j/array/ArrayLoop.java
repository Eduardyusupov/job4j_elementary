package ru.job4j.array;

public class ArrayLoop {

    public static void main(String[] args) {

        int[] elements = new int[5];

        for (int index = 0; index < elements.length; index++) {
            elements[index] = index * 2 + 3;
        }

        for (int element : elements) {
            System.out.println(element);
        }
    }
}
