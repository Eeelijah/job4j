package ru.job4j.tracker.singleton;

import ru.job4j.tracker.Item;

public enum TrackerSingletonEnum {
    INSTANCE;

    public Item add(Item model) {
        return model;
    }
}
