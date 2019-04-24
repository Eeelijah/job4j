package ru.job4j.condition;

/**
 * Класс для вычисления площади треугольника.
 *
 * @author Ilya Balov
 * @version 1
 * @since 23.04.2019
 */
public class Triangle {

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
    public double area(int x1, int y1, int x2, int y2, int x3, int y3) {
        double rsl = -1;
        double a = new Point().distance(x1, y1, x2, y2);
        double b = new Point().distance(x2, y2, x3, y3);
        double c = new Point().distance(x1, y1, x3, y3);
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
     * @return
     */
    private boolean exist(double a, double c, double b) {
        return (a + b > c && a + c > b && b + c > a);
    }
}
