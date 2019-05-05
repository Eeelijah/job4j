package ru.job4j.tracker.singleton;

import ru.job4j.tracker.Item;

public class StaticTrackerSignleton {

    private static StaticTrackerSignleton instance;

    private StaticTrackerSignleton() {
    }

    public static StaticTrackerSignleton getInstance() {
        if (instance == null) {
            instance = new StaticTrackerSignleton();
        }
        return instance;
    }

    public Item add(Item model) {
        return model;
    }
}
