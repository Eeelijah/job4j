package ru.job4j.tracker.singleton;

import org.junit.Test;
import ru.job4j.tracker.Item;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TrackerSingletonTest {

    @Test
    public void whenEnumTrackerSingleton() {
        TrackerSingletonEnum instance = TrackerSingletonEnum.INSTANCE;
        TrackerSingletonEnum instance2 = TrackerSingletonEnum.INSTANCE;
        instance.add(new Item("test", "desc", 123L));
        assertThat(instance, is(instance2));
    }

    @Test
    public void whenStaticTrackerSingleton() {
        StaticTrackerSignleton instance = StaticTrackerSignleton.getInstance();
        StaticTrackerSignleton instance2 = StaticTrackerSignleton.getInstance();
        instance.add(new Item("test", "desc", 123L));
        assertThat(instance, is(instance2));
    }

    @Test
    public void whenStaticFinalTrackerSingleton() {
        StaticFinalTrackerSingleton instance = StaticFinalTrackerSingleton.getInstance();
        StaticFinalTrackerSingleton instance2 = StaticFinalTrackerSingleton.getInstance();
        instance.add(new Item("test", "desc", 123L));
        assertThat(instance, is(instance2));
    }

    @Test
    public void whenStaticFinalInnerTrackerSingleton() {
        StaticFinalInnerTrackerSingleton instance = StaticFinalInnerTrackerSingleton.getInstance();
        StaticFinalInnerTrackerSingleton instance2 = StaticFinalInnerTrackerSingleton.getInstance();
        instance.add(new Item("test", "desc", 123L));
        assertThat(instance, is(instance2));
    }
}
