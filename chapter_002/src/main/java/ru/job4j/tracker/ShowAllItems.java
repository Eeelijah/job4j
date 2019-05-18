package ru.job4j.tracker;

import java.util.function.Consumer;

public class ShowAllItems extends BaseAction {

    public ShowAllItems(int key, String name) {
        super(key, name);
    }

    @Override
    public void execute(Input input, Tracker tracker, Consumer<String> output) {
        output.accept("------------ Вывод всех заявок --------------");
        for (Item item : tracker.findAll()) {
            output.accept(item.toString());
        }
    }
}
