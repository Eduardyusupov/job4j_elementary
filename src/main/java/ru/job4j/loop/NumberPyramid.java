package ru.job4j.loop;

public class NumberPyramid {
    public static void draw(int n) {
        for (int i = 1; i <= n; i++) {
            for (int a = 1; a <= n - i; a++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int b = i - 1; b != 0 && b < i; b--) {
                System.out.print(b);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        draw(1);
        System.out.println("Number pyramid of height 3:");
        draw(3);
        System.out.println("Number pyramid of height 5:");
        draw(5);
    }
}
