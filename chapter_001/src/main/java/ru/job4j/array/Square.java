package ru.job4j.array;

/**
 * Класс для возведения чисел в квадрат.
 *
 * @author Ilya Balov
 * @version 1
 * @since 25.04.2019
 */
public class Square {

    /**
     * Метод для возведения чисел в квадрат.
     *
     * @param bound - число чисел в массиве
     * @return массив чисел, возведенных в квадрат
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 1; i <= bound; i++) {
            rst[i - 1] = i * i;
        }
        return rst;
    }
}
