package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (symbol == input.charAt(i)) {
                counter++;
            } else {
                result += (counter > 1) ? symbol + String.valueOf(counter) : symbol;
                symbol = input.charAt(i);
                counter = 1;
            }
        }
        return result + ((counter > 1) ? symbol + String.valueOf(counter) : symbol);
    }
}