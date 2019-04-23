package ru.job4j.converter;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for Converter class.
 *
 * @author Ilya Balov
 * @version 23.04.2015
 * @since 1
 */
public class ConverterTest {

    /**
     * Test roubleToEuro method.
     */
    @Test
    public void when70RoublesToEurosThen1() {
        Converter converter = new Converter();
        int result = converter.roubleToEuro(70);
        assertThat(result, is(1));
    }

    /**
     * Test roubleToDollar method.
     */
    @Test
    public void when60RoublesToDollarsThen1() {
        Converter converter = new Converter();
        int result = converter.roubleToDollar(60);
        assertThat(result, is(1));
    }

    /**
     * Test euroToRouble method.
     */
    @Test
    public void when2EurosToRoublesThen140() {
        Converter converter = new Converter();
        int result = converter.euroToRouble(2);
        assertThat(result, is(140));
    }

    /**
     * Test dollarToRouble method.
     */
    @Test
    public void when3DollarsToRoublesThen180() {
        Converter converter = new Converter();
        int result = converter.dollarToRouble(3);
        assertThat(result, is(180));
    }
}
