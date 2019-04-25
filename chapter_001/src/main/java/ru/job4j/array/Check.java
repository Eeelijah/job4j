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
        boolean check = false;
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            if (count == 1 && data[i] != check) {
                return false;
            }
            if (data[i] != check) {
                check = true;
                count++;
            }
        }
        return true;
    }
}
