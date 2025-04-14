package ru.job4j;

public class Converter {

    /**
     * Метод проверяет конвертацию рублей к евро.
     *
     * @param value Количество рублей для конвертации
     * @return Конвертиованные в евро рубли.
     */
    public static float rubleToEuro(float value) {
        return value / 90;
    }

    /**
     * Метод проверяет конвертацию рублей к доллару.
     *
     * @param value Количество рублей для конвертации
     * @return Конвертиованные в доллары рубли.
     */
    public static float rubleToDollar(float value) {
        return value / 80;
    }
}
