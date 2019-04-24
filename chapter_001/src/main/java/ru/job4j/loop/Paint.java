package ru.job4j.loop;

import java.util.function.BiPredicate;

/**
 * Класс для построения пирамиды.
 *
 * @author Ilya Balov
 * @version 1
 * @since 24.04.2019
 */
public class Paint {

    /**
     * Метод для рисования правой части пирамиды
     *
     * @param height высота пирамиды
     * @return строка с правой частью пирамиды
     */
    public String rightTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= column
        );
    }

    /**
     * Метод для рисования левой части пирамиды
     *
     * @param height высота пирамиды
     * @return строка с левой частью пирамиды
     */
    public String leftTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= height - column - 1
        );
    }

    /**
     * Метод для рисования полной пирамиды
     *
     * @param height высота пирамиды
     * @return строка с пирамидой
     */
    public String pyramid(int height) {
        return this.loopBy(
                height,
                2 * height - 1,
                (row, column) -> row >= height - column - 1 && row + height - 1 >= column
        );
    }

    /**
     * @param height  высота пирамиды
     * @param widht   ширина пирамиды
     * @param predict условие отрисовывания знака ^
     * @return строка с пирамидой
     */
    private String loopBy(int height, int widht, BiPredicate<Integer, Integer> predict) {
        StringBuilder screen = new StringBuilder();
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != widht; column++) {
                if (predict.test(row, column)) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
}
