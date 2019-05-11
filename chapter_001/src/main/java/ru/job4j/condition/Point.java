package ru.job4j.condition;

/**
 * Класс для вычисления расстояния методу точками в системе координат.
 *
 * @author Ilya Balov
 * @version 1
 * @since 23.04.2019
 */
public class Point {

    private int x;
    private int y;
    private int z;

    /**
     * Конструктор, который принимает начальное состояние объекта "точка".
     * @param first координата x
     * @param second координата y
     */
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Метод для вычисления расстояния методу точками.
     * @param that Вторая точка
     * @return расстояние между двумя точками
     */
    public double distance(Point that) {
        return Math.sqrt(Math.pow((this.x - that.x), 2) + Math.pow((this.y - that.y), 2));
    }

    public double distance3d(Point that) {
        return Math.sqrt(Math.pow((this.x - that.x), 2) + Math.pow((this.y - that.y), 2) + Math.pow((this.z - that.z), 2));
    }

    /**
     * Метод выводит информацию о координатах точки.
     */
    public void info() {
        System.out.println(String.format("Point[%s, %s]", this.x, this.y));
    }
}
