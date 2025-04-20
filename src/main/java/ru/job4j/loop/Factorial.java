package ru.job4j.loop;

public class Factorial {

    public static int calculateFactorial(int number) {
        if (number == 0) {
            return 1;
        }
        int factorial = 1;
        for (int startNumber = 1; startNumber <= number; startNumber++) {
            factorial = factorial * startNumber;
        }
        return factorial;
    }

}
