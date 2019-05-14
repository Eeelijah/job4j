package ru.job4j.sort;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import java.util.*;

public class SortUserTest {

    @Test
    public void whenListIntoTreeSetSortedByAge() {
        SortUser sorter = new SortUser();
        List<User> users = new ArrayList<>();
        users.add(new User("Ilya", 26));
        users.add(new User("Petr", 27));
        users.add(new User("Vasya", 18));
        users.add(new User("Misha", 15));
        users.add(new User("Stas", 30));
        Set<User> result = sorter.sort(users);
        assertThat(result.iterator().next(), is(new User("Misha", 15)));
    }
}
