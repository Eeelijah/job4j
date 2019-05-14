package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

/**
 * Test for Converter class.
 *
 * @author Ilya Balov
 * @version 1
 * @since 28.04.2015
 */
public class TrackerTest {

    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        long created = System.currentTimeMillis();
        Item item = new Item("test1", "testDescription", created);
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "testDescription", 123L);
        tracker.add(previous);
        Item next = new Item("test2", "testDescription2", 1234L);
        next.setId(previous.getId());
        tracker.replace(previous.getId(), next);
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }

    @Test
    public void whenDeleteItemThenTrackerHasNoSuchItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("itemToBeDeleted", "testDescription", 123L);
        tracker.add(item);
        tracker.delete(item.getId());
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }

    @Test
    public void whenAdd5NewItemsThenTrackerHasSameItems() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("item1", "testDescription", 1L);
        Item item2 = new Item("item2", "testDescription", 12L);
        Item item3 = new Item("item3", "testDescription", 123L);
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        List<Item> expected = Arrays.asList(item1, item2, item3);
        assertThat(tracker.findAll(), is(expected));
    }

    @Test
    public void whenAdd3NewItemsWithSameNameTrackerHasThem() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1", "testDescription", 1L);
        Item item2 = new Item("test1", "testDescription", 12L);
        Item item3 = new Item("test1", "testDescription", 123L);
        Item item4 = new Item("test2", "testDescription", 123L);
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        tracker.add(item4);
        List<Item> expected = Arrays.asList(item1, item2, item3);
        assertThat(tracker.findByName(item1.getName()), is(expected));
    }

    @Test
    public void whenReplaceNonExistingItemThenFalse() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("added", "testDescription", 123L);
        Item item2 = new Item("notAdded", "testDescription", 123L);
        tracker.add(item1);
        assertThat(tracker.replace(item2.getId(), item2), is(false));
    }

    @Test
    public void whenDeleteNonExistingItemThenFalse() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("added", "testDescription", 123L);
        Item item2 = new Item("notAdded", "testDescription", 123L);
        tracker.add(item1);
        assertThat(tracker.delete(item2.getId()), is(false));
    }

    @Test
    public void whenAddNothingThenFindAllIsAbsent() {
        Tracker tracker = new Tracker();
        List<Item> expected = new ArrayList<>();
        List<Item> result = tracker.findAll();
        assertThat(result, is(expected));
    }

    @Test
    public void whenItemsHasNoIdThenNull() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("added", "testDescription", 123L);
        Item item2 = new Item("notAdded", "testDescription", 123L);
        tracker.add(item1);
        assertThat(tracker.findById(item2.getId()), is(nullValue()));
    }
}
