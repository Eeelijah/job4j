package ru.job4j.generics;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserConvertTest {

    @Test
    public void whenConvertListToMap() {
        UserConvert convertor = new UserConvert();
        List<User> users  = new ArrayList<>();
        Map<Integer, User> expected = new HashMap<>();
        User user1 = new User(5, "Ilya", "Moscow");
        User user2 = new User(17, "Dima", "SPB");
        User user3 = new User(9, "Petya", "Omsk");
        users.add(user1);
        users.add(user2);
        users.add(user3);
        expected.put(user1.getId(), user1);
        expected.put(user2.getId(), user2);
        expected.put(user3.getId(), user3);
        Map<Integer, User> result = convertor.process(users);
        assertThat(result, is(expected));
    }
}
