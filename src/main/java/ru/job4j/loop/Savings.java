package ru.job4j.loop;

public class Savings {

    public static int years(double goal, double annualDeposit, double percent) {
        int years = 0;
        double total = 0;
        double percentSum;
        do {
            percentSum = total * (percent / 100);
            total += percentSum + annualDeposit;
            years++;
        } while (total < goal);
        return years;
    }

}
