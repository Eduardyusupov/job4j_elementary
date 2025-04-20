package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int startNumber = start; startNumber <= finish; startNumber++) {
            sum = sum + startNumber;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int startNumber = start; startNumber <= finish; startNumber++) {
            if (startNumber % 2 == 0) {
                sum = sum + startNumber;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
        System.out.println(sumByEven(-2, 8));
    }

}
