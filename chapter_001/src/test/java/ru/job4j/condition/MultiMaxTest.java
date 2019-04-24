package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Test for Multimax class.
 *
 * @author Ilya Balov
 * @version 24.04.2015
 * @since 1
 */
public class MultiMaxTest {

    /**
     * Test max method.
     */
    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 2);
        assertThat(result, is(4));
    }
}
