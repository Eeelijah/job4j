package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for FindLoop class.
 *
 * @author Ilya Balov
 * @version 25.04.2015
 * @since 1
 */
public class FindLoopTest {

    /**
     * Test indexOf() method
     */
    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    /**
     * Test indexOf() method
     */
    @Test
    public void whenArrayHasNothingThenMinus1() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{5, 4, 3, 8};
        int value = 7;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }
}
