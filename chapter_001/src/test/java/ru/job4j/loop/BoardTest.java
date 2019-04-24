package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Test for Board class.
 *
 * @author Ilya Balov
 * @version 24.04.2015
 * @since 1
 */
public class BoardTest {

    /**
     * Test paint method
     */
    @Test
    public void when3x3() {
        Board board = new Board();
        String rsl = board.paint(3, 3);
        String ln = System.lineSeparator();
        assertThat(rsl, is(String.format("X X%s X %sX X%s", ln, ln, ln)));
    }

    /**
     * Test paint method
     */
    @Test
    public void when5x4() {
        Board board = new Board();
        String rsl = board.paint(5, 4);
        String ln = System.lineSeparator();
        assertThat(rsl, is(String.format("X X X%s X X %sX X X%s X X %s", ln, ln, ln, ln)));
    }
}
