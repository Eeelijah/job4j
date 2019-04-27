package ru.job4j.condition;

/**
 * Класс для вычисления площади треугольника.
 *
 * @author Ilya Balov
 * @version 1
 * @since 23.04.2019
 */
public class Triangle {

    private Point first;
    private Point second;
    private Point third;

    /**
     * Конструктор, который принимает три точки вершин треугольника.
     * @param first вершина 1
     * @param second вершина 2
     * @param third вершина 3
     */
    public Triangle(Point first, Point second, Point third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    /**
     * Метод вычисления периметра по длинам сторон.
     * <p>
     * Формула.
     * (a + b + c) / 2
     *
     * @param a расстояние между точками a b
     * @param b расстояние между точками a c
     * @param c расстояние между точками b c
     * @return периметр.
     */
    public double perimeter(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    /**
     * Метод вычисления прощади треугольника.
     * <p>
     * Формула.
     * √ p *(p - ab) * (p - ac) * (p - bc)
     *
     * @return прощадь, если треугольник существует, или -1.
     */
    public double area() {
        double rsl = -1;
        double a = first.distance(second);
        double b = second.distance(third);
        double c = third.distance(first);
        double p = perimeter(a, b, c);
        if (this.exist(a, b, c)) {
            rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return rsl;
    }

    /**
     * Метод проверяет можно ли построить треугольник с такими длинами сторон.
     * <p>
     * Подумайте какое надо написать условие, чтобы определить можно ли построить треугольник.
     *
     * @param a Длина от точки a b.
     * @param b Длина от точки a c.
     * @param c Длина от точки b c.
     * @return boolean - существует ли треугольник
     */
    private boolean exist(double a, double c, double b) {
        return (a + b > c && a + c > b && b + c > a);
    }
}
