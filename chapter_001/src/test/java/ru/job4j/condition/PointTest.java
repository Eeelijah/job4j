package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
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
        Point first = new Point(0, 0);
        Point second = new Point(0, 10);
        double result = first.distance(second);
        first.info();
        second.info();
        System.out.println(String.format("Result is %s", result));
        assertThat(result, is(10D));
    }

    @Test
    public void whenZeroAndFiveAndTenThenTen() {
        Point first = new Point(0, 0, 0);
        Point second = new Point(0, 5, 10);
        double result = first.distance3d(second);
        assertEquals(result, 11.1803d, 0.0001);
    }

    @Test
    public void whenCheckItself() {
        Point point = new Point(0, 0);
        double result = point.distance(point);
        assertThat(result, is(0D));
    }

    @Test
    public void whenShowInfo() {
        Point first = new Point(1, 1);
        first.info();
        Point second = new Point(2, 2);
        second.info();
    }
}
