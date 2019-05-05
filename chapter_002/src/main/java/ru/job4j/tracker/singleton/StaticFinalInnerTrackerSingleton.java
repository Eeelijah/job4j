package ru.job4j.tracker.singleton;

import ru.job4j.tracker.Item;

public class StaticFinalInnerTrackerSingleton {
    private StaticFinalInnerTrackerSingleton() {
    }

    public static StaticFinalInnerTrackerSingleton getInstance() {
        return Holder.INSTANCE;
    }

    private static final class Holder {
        private static final StaticFinalInnerTrackerSingleton INSTANCE = new StaticFinalInnerTrackerSingleton();
    }

    public Item add(Item model) {
        return model;
    }
}
