package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Test for Point class.
 *
 * @author Ilya Balov
 * @version 23.04.2015
 * @since 1
 */
public class PointTest {

    /**
     * Test distance method.
     */
    @Test
    public void whenZeroAndTenThenTen() {
        Point point = new Point();
        double result = point.distance(0, 0, 0, 10);
        assertThat(result, is(10D));
    }
}
