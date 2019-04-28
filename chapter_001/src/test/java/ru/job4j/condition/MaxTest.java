package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for Max class.
 *
 * @author Ilya Balov
 * @version 23.04.2015
 * @since 1
 */
public class MaxTest {

    /**
     * Test max method.
     */
    @Test
    public void whenMax1To2Then2() {
        Max max = new Max();
        int result = max.max(1, 2);
        assertThat(result, is(2));
    }

    /**
     * Test max method.
     */
    @Test
    public void whenMax5To3Then5() {
        Max max = new Max();
        int result = max.max(5, 3);
        assertThat(result, is(5));
    }

    /**
     * Test max method.
     */
    @Test
    public void whenMax4To4Then4() {
        Max max = new Max();
        int result = max.max(4, 4);
        assertThat(result, is(4));
    }

    /**
     * Test max method.
     */
    @Test
    public void whenMax3To4To7Then7() {
        Max max = new Max();
        int result = max.max(3, 4, 7);
        assertThat(result, is(7));
    }
}
