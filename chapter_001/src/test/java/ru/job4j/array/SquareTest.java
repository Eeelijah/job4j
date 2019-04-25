package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for Board class.
 *
 * @author Ilya Balov
 * @version 25.04.2015
 * @since 1
 */
public class SquareTest {

    /**
     * Test calculate method for 3 numbers
     */
    @Test
    public void whenBound3Then149() {
        int bound = 3;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[]{1, 4, 9};
        assertThat(rst, is(expect));
    }

    /**
     * Test calculate method for 7 numbers
     */
    @Test
    public void whenBound7() {
        int bound = 7;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[]{1, 4, 9, 16, 25, 36, 49};
        assertThat(rst, is(expect));
    }

    /**
     * Test calculate method for 12 numbers
     */
    @Test
    public void whenBound12() {
        int bound = 12;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[]{1, 4, 9, 16, 25, 36, 49, 64 ,81, 100, 121, 144};
        assertThat(rst, is(expect));
    }
}
