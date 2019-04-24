package ru.job4j.loop;

/**
 * Класс для вычисления факториала.
 *
 * @author Ilya Balov
 * @version 1
 * @since 24.04.2019
 */
public class Factorial {

    /**
     * Метод для вычисления факториала.
     *
     * @param n число, для которого необходимо вычислить факториал.
     * @return факториал.
     */
    public int calc(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
