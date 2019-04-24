package ru.job4j.condition;

/**
 * Класс для вычисления максимума из трех чисел.
 *
 * @author Ilya Balov
 * @version 1
 * @since 24.04.2019
 */
public class MultiMax {

    /**
     * Метод для вычисления максимума из трех чисел.
     *
     * @param first первое число
     * @param second второе число
     * @param third третье число
     * @return максимальное число
     */
    public int max(int first, int second, int third) {
        int result = first > second ? first : second;
        result = result > third ? result : third;

        return result;
    }
}
