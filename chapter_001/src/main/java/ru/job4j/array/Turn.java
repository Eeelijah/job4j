package ru.job4j.array;

/**
 * Класс для переворачивания массива.
 *
 * @author Ilya Balov
 * @version 1
 * @since 25.04.2019
 */
public class Turn {

    /**
     * Метод для переворачивания массива.
     *
     * @param array массив
     * @return перевернутый массив
     */
    public int[] back(int[] array) {
        int tmp;
        for (int i = 0; i < array.length / 2; i++) {
            tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
        }
        return array;
    }
}
