package ru.job4j.array;

/**
 * @author Ilya Balov
 * @version 1
 * @since 26.04.2019
 */
public class MatrixCheck {

    /**
     *
     * @param data массив
     * @return boolean
     */
    public boolean mono(boolean[][] data) {
        if (data[0] != null && data.length != data[0].length) {
            throw new RuntimeException("Массив не является матрицей");
        }
        int length = data.length;
        for (int i = 0; i < length - 1; i++) {
            if (data[i][i] != data[i + 1][i + 1] || data[i][length - 1 - i] != data[i+1][length - 2 - i]) {
                return false;
            }
        }
        return true;
    }
}
