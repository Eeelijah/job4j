package ru.job4j.tracker;

import java.util.function.Consumer;

public class AddItem extends BaseAction {

    public AddItem(int key, String name) {
        super(key, name);
    }

    @Override
    public void execute(Input input, Tracker tracker, Consumer<String> output) {
        output.accept("------------ Добавление новой заявки --------------");
        String name = input.ask("Введите имя заявки:", output);
        String desc = input.ask("Введите описание заявки:", output);
        Item item = new Item(name, desc, System.currentTimeMillis());
        tracker.add(item);
        output.accept("------------ Новая заявка с id: '" + item.getId() + "' -----------");
    }
}
