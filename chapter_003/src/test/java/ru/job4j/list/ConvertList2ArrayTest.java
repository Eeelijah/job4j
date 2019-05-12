package ru.job4j.list;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

import java.util.Arrays;

public class ConvertList2ArrayTest {

    @Test
    public void when7ElementsAnd3RowsThen9() {
        ConvertList2Array convert = new ConvertList2Array();
        int[][] result = convert.toArray(Arrays.asList(1, 2, 3, 4, 5, 6, 7), 3);
        int[][] expected = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 0, 0 }
        };
        assertThat(result, is(expected));
    }

    @Test
    public void when20ElementsAnd3RowsThen21() {
        ConvertList2Array convert = new ConvertList2Array();
        int[][] result = convert.toArray(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20), 3);
        int[][] expected = {
                {1, 2, 3, 4, 5, 6, 7},
                {8, 9, 10, 11, 12, 13, 14},
                {15, 16, 17, 18, 19, 20, 0}
        };
        assertThat(result, is(expected));
    }

    @Test
    public void when10ElementsAnd5RowsThen10() {
        ConvertList2Array convert = new ConvertList2Array();
        int[][] result = convert.toArray(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 5);
        int[][] expected = {
                {1, 2},
                {3, 4},
                {5, 6},
                {7, 8},
                {9, 10}
        };
        assertThat(result, is(expected));
    }
}
