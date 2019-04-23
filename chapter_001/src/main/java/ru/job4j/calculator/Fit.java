package ru.job4j.calculator;

/**
 * Программа расчета идеального веса.
 *
 * @author Ilya Balov
 * @version 1
 * @since 23.04.2019
 */
public class Fit {

    /**
     * Идеальный вес для мужщины.
     *
     * @param height Рост в сантиметрах.
     * @return идеальный вес.
     */
    public double manWeight(double height) {
        return (height - 100) * 1.15d;
    }

    /**
     * Идеальный вес для женщины.
     *
     * @param height Рост в сантиметрах.
     * @return идеальный вес.
     */
    public double womanWeight(double height) {
        return (height - 110) * 1.15d;
    }
}
