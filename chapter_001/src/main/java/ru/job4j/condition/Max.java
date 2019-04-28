package ru.job4j.condition;

/**
 * Класс для вычисления максимума.
 *
 * @author Ilya Balov
 * @version 1
 * @since 23.04.2019
 */
public class Max {

    /**
     * Метод, вычисляющий максимум из двух чисел.
     *
     * @param left  первое число
     * @param right второе число
     * @return максимум
     */
    public int max(int left, int right) {
        return left >= right ? left : right;
    }

    /**
     * Метод, вычисляющий максимум из трех чисел.
     *
     * @param first  первое число
     * @param second второе число
     * @param third третье число
     * @return максимум
     */
    public int max(int first, int second, int third) {
        int firstMax = max(first, second);
        return third >= firstMax ? third : firstMax;
    }
}
