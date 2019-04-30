package ru.job4j.loop;

/**
 * Класс для подсчета суммы чётных чисел в диапазоне.
 *
 * @author Ilya Balov
 * @version 1
 * @since 24.04.2019
 */
public class Counter {

    /**
     * Метод для подсчета суммы чётных чисел в диапазоне.
     *
     * @param start начало диапазона
     * @param finish конец диапазона
     * @return сумма чисел
     */
    public int add(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 != 0) {
                continue;
            }
            sum += i;
        }
        return sum;
    }
}
