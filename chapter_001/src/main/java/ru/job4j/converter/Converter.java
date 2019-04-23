package ru.job4j.converter;

/**
 * Корвертор валюты.
 *
 * @author Ilya Balov
 * @since 23.04.2019
 * @version 1
 */
public class Converter {

    /**
     * Конвертируем рубли в евро.
     *
     * @param roubles рубли.
     * @return Евро.
     */
    public int roubleToEuro(int roubles) {
        return roubles / 70;
    }

    /**
     * Конвертируем рубли в доллары.
     *
     * @param roubles рубли.
     * @return Доллары
     */
    public int roubleToDollar(int roubles) {
        return roubles / 60;
    }

    /**
     * Конвертируем рубли в евро.
     *
     * @param euros евро.
     * @return рубли.
     */
    public int euroToRouble(int euros) {
        return euros * 70;
    }

    /**
     * Конвертируем рубли в доллары.
     *
     * @param dollars доллары.
     * @return рубли.
     */
    public int dollarToRouble(int dollars) {
        return dollars * 60;
    }
}