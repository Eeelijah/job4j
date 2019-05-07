package ru.job4j.tracker.singleton;

import ru.job4j.tracker.Item;

public class StaticFinalTrackerSingleton {
    private static final StaticFinalTrackerSingleton INSTANCE = new StaticFinalTrackerSingleton();

    private StaticFinalTrackerSingleton() {
    }

    public static StaticFinalTrackerSingleton getInstance() {
        return INSTANCE;
    }

    public Item add(Item model) {
        return model;
    }
}
