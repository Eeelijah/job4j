package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for Check class.
 *
 * @author Ilya Balov
 * @version 25.04.2015
 * @since 1
 */
public class CheckTest {

    /**
     * Test mono method/
     */
    @Test
    public void whenDataMonoByTrueThenTrue() {
        Check checker = new Check();
        boolean[] input = new boolean[]{true, true, true};
        boolean result = checker.mono(input);
        assertThat(result, is(true));
    }

    /**
     * Test mono method
     */
    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        Check checker = new Check();
        boolean[] input = new boolean[]{true, false, true};
        boolean result = checker.mono(input);
        assertThat(result, is(false));
    }
}
