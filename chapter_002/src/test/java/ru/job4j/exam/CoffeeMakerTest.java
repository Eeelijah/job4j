package ru.job4j.exam;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CoffeeMakerTest {

    @Test
    public void whenPrice50andCost35() {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        int[] result = coffeeMaker.changes(50, 35);
        int[] expected = {10, 5};
        assertThat(result, is(expected));
    }

    @Test
    public void whenPrice50andCost32() {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        int[] result = coffeeMaker.changes(50, 32);
        int[] expected = {10, 5, 2 ,1};
        assertThat(result, is(expected));
    }
}
