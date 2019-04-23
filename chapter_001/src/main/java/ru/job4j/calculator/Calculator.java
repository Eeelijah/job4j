package ru.job4j.calculator;

/**
 * Class Класс для вычислений арифметических операций + - * / ^.
 * @author Ilya Balov
 * @since 23.04.2019
 * @version 1
 */
public class Calculator {
    /**
     * Метод производит сложение двух введенных чисел.
     * @param summand1 первое слагаемое.
     * @param summand2 второе слагаемое.
     * @return результат сложения first и second.
     */
    public double add(double summand1, double summand2) {
        return summand1 + summand2;
    }

    /**
     * Метод производит вычитание двух введенных чисел.
     * @param minuend уменьшаемое.
     * @param subtrahend вычитаемое.
     * @return результат вычитания second из first.
     */
    public double subtract(double minuend, double subtrahend) {
        return minuend - subtrahend;
    }

    /**
     * Метод производит деление двух введенных чисел.
     * @param dividend делимое.
     * @param divisor делитель.
     * @return результат деления делимого на делитель.
     */
    public double div(double dividend, double divisor) {
        return dividend / divisor;
    }

    /**
     * Метод производит умножение двух введенных чисел.
     * @param multiplicand множимое.
     * @param multiplier множитель.
     * @return результат умножения множимого на множитель.
     */
    public double multiply(double multiplicand, double multiplier) {
        return multiplicand * multiplier;
    }
}
