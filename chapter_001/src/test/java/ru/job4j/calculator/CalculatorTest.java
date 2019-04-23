package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for Calculator class.
 *
 * @author Ilya Balov
 * @version 23.04.2015
 * @since 1
 */
public class CalculatorTest {

    /**
     * Test add method.
     */
    @Test
    public void whenAddOnePlusOneThenTwo()  {
        Calculator calculator = new Calculator();
        double result = calculator.add(1d, 1d);
        double expected = 2d;
        assertThat(result, is(expected));
    }

    /**
     * Test subtract method.
     */
    @Test
    public void whenSubstract2From6Then3()  {
        Calculator calculator = new Calculator();
        double result = calculator.subtract(6d, 2d);
        double expected = 4d;
        assertThat(result, is(expected));
    }

    /**
     * Test div method.
     */
    @Test
    public void whenDiv2On2Then1() {
        Calculator calculator = new Calculator();
        double result = calculator.div(2d, 2d);
        double expected = 1d;
        assertThat(result, is(expected));
    }

    /**
     * Test multiply method.
     */
    @Test
    public void whenMultiply3On2Then6() {
        Calculator calculator = new Calculator();
        double result = calculator.multiply(3d, 2d);
        double expected = 6d;
        assertThat(result, is(expected));
    }
}
