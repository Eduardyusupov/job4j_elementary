package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];

        names[0] = "Ivan";
        names[1] = "Vladimir";
        names[2] = "Igor";
        names[3] = "Vladislav";

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);

        System.out.println("Размер short массива = " + ages.length);
        System.out.println("Размер String массива = " + surnames.length);
        System.out.println("Размер float массива = " + prices.length);
    }
}
