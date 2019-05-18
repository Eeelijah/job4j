package ru.job4j.lambda;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

public class FunctionsTest {

    @Test
    public void whenLinearFunctionThenLinearResults() {
        Functions func = new Functions();
        List<Double> result = func.range(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunctionThenQuadraticResult() {
        Functions func = new Functions();
        List<Double> result = func.range(5, 8, x -> 2 * x * x);
        List<Double> expected = Arrays.asList(50D, 72D, 98D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLogarithmicFunctionThenLogarithmicResults() {
        Functions func = new Functions();
        DecimalFormat df = new DecimalFormat("#.#####");
        df.setRoundingMode(RoundingMode.CEILING);
        List<Double> result = func.range(5, 8, x -> (Double.valueOf(df.format(Math.log10(x)))));
        List<Double> expected = Arrays.asList(0.69898D, 0.77816D, 0.8451D);
        assertThat(result, is(expected));
    }
}
