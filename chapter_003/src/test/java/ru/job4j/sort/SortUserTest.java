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

    @Test
    public void whenUsersSortedByNameLength() {
        SortUser sorter = new SortUser();
        User user1 = new User("Александр", 26);
        User user2 = new User("Петр", 27);
        User user3 = new User("Евгений", 18);
        User user4 = new User("Геннадий", 15);
        User user5 = new User("Ян", 30);
        List<User> users = Arrays.asList(user1, user2, user3, user4, user5);
        List<User> result = sorter.sortNameLength(users);
        List<User> expected = Arrays.asList(user5, user2, user3, user4, user1);
        assertThat(result, is(expected));
    }

    @Test
    public void whenUsersSortedByNameAndAge() {
        SortUser sorter = new SortUser();
        User user1 = new User("Сергей", 25);
        User user2 = new User("Иван", 30);
        User user3 = new User("Сергей", 20);
        User user4 = new User("Иван", 25);
        List<User> users = Arrays.asList(user1, user2, user3, user4);
        List<User> expected = Arrays.asList(user4, user2, user3, user1);
        List<User> result = sorter.sortByAllFields(users);
        assertThat(result, is(expected));
    }
}
