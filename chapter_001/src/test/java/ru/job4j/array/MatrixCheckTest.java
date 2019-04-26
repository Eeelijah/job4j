package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for MatrixCheck class.
 *
 * @author Ilya Balov
 * @version 26.04.2015
 * @since 1
 */
public class MatrixCheckTest {
    @Test
    public void whenDataMonoByTrueThenTrue() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][]{
                {true, true, true},
                {false, true, true},
                {true, false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][]{
                {true, true, false},
                {false, false, true},
                {true, false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }

    @Test
    public void whenMatrix5x5ByTrueThenTrue() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][]{
                {true, true, false, true, true},
                {false, true, true, true, false},
                {true, false, true, false, false},
                {true, true, false, true, false},
                {true, false, true, false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    @Test(expected = RuntimeException.class)
    public void whenIsNotMatrix() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][]{
                {true, true, false},
                {false, false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }
}
