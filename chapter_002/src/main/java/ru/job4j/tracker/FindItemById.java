package ru.job4j.tracker;

import java.util.function.Consumer;

public class FindItemById extends BaseAction {

    public FindItemById(int key, String name) {
        super(key, name);
    }

    @Override
    public void execute(Input input, Tracker tracker, Consumer<String> output) {
        output.accept("------------ Поиск заявки по id --------------");
        String id = input.ask("Введите id заявки, которую хотите найти:", output);
        Item item = tracker.findById(id);
        String out = item != null ? "------------ Найдена заявка: " + item.toString() + ". -----------"
                : "------------ Заявки с id: '" + id + "' не существует. -----------";
        output.accept(out);
    }
}
