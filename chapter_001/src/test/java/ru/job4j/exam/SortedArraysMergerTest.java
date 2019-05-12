package ru.job4j.exam;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortedArraysMergerTest {

    @Test
    public void whenMerge2SortedArrays() {
        SortedArraysMerger merger = new SortedArraysMerger();
        int[] a = {1, 3};
        int[] b = {2, 4};
        int[] result = merger.merge(a, b);
        int[] expected = {1, 2, 3, 4};
        assertThat(result, is(expected));
    }

    @Test
    public void whenMerge2SortedArrays2() {
        SortedArraysMerger merger = new SortedArraysMerger();
        int[] a = {1, 3, 5, 12, 14, 17, 38, 40};
        int[] b = {2, 4, 6, 7, 29, 50};
        int[] result = merger.merge(a, b);
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 12, 14, 17, 29, 38, 40, 50};
        assertThat(result, is(expected));
    }
}
