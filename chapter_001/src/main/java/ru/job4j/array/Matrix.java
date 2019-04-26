package ru.job4j.array;

/**
 * Класс для построения таблицы умножения.
 *
 * @author Ilya Balov
 * @version 1
 * @since 26.04.2019
 */
public class Matrix {

    /**
     * Метод для построения таблицы умножения.
     * @param size размерность таблицы
     * @return таблица
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (j + 1) * (i + 1);
            }
        }
        return table;
    }
}
