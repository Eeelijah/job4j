package ru.job4j.exam;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DepartmentSorterTest {
    private DepartmentSorter ds = new DepartmentSorter();

    @Before
    public void addDepartments() {
        ds.addDepartment("K1\\SK1\\SSK2");
        ds.addDepartment("K1\\SK1\\SSK1");
        ds.addDepartment("K2\\SK1\\SSK1");
        ds.addDepartment("K2\\SK1\\SSK2");
        ds.addDepartment("K1\\SK1");
        ds.addDepartment("K1\\SK2");
        ds.addDepartment("K2");
    }

    @Test
    public void whenAscSorted(){
        String[] expected = {"K1", "K1\\SK1", "K1\\SK1\\SSK1", "K1\\SK1\\SSK2", "K1\\SK2", "K2", "K2\\SK1", "K2\\SK1\\SSK1", "K2\\SK1\\SSK2"};
        Assert.assertThat(ds.getDepartments(), Is.is(expected));
    }

    @Test
    public void whenDescSorted(){
        String[] expected = {"K2", "K2\\SK1", "K2\\SK1\\SSK2", "K2\\SK1\\SSK1", "K1", "K1\\SK2", "K1\\SK1", "K1\\SK1\\SSK2", "K1\\SK1\\SSK1"};
        Assert.assertThat(ds.getReverseDepartments(), Is.is(expected));
    }
}