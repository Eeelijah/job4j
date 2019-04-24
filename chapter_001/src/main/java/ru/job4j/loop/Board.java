package ru.job4j.loop;

/**
 * Класс для построения шахматной доски.
 *
 * @author Ilya Balov
 * @version 1
 * @since 24.04.2019
 */
public class Board {

    /**
     * Метод для построения шахматной доски.
     *
     * @param width ширина доски
     * @param height высота доски
     * @return строка, представляющая шахматную доску
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if ((i + j) % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(ln);
        }
        return screen.toString();
    }
}
