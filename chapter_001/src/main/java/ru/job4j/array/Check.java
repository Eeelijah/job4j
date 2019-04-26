package ru.job4j.array;

/**
 * Класс для проверки массива на true/false.
 *
 * @author Ilya Balov
 * @version 1
 * @since 25.04.2019
 */
public class Check {

    /**
     * Метод для проверки массива на true/false.
     * @param data массив
     * @return true/false
     */
    public boolean mono(boolean[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] != data[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
