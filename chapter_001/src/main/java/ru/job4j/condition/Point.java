package ru.job4j.condition;

/**
 * Класс для вычисления расстояния методу точками в системе координат..
 *
 * @author Ilya Balov
 * @version 1
 * @since 23.04.2019
 */
public class Point {

    /**
     * Метод для вычисления расстояния методу точками
     *
     * @param x1 расположение первой точки на оси х.
     * @param y1 расположение первой точки на оси y.
     * @param x2 расположение второй точки на оси х.
     * @param y2 расположение второй точки на оси y.
     * @return расстояние между двумя точками
     */
    public double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
}
