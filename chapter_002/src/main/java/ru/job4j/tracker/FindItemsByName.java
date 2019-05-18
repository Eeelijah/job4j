package ru.job4j.tracker;

import java.util.List;
import java.util.function.Consumer;

public class FindItemsByName extends BaseAction {

    public FindItemsByName(int key, String name) {
        super(key, name);
    }

    @Override
    public void execute(Input input, Tracker tracker, Consumer<String> output) {
        output.accept("------------ Поиск заявки по имени --------------");
        String name = input.ask("Введите имя заявки, которую хотите найти:", output);
        List<Item> found = tracker.findByName(name);
        if (found != null) {
            output.accept("------------ Найдены заявки: -----------");
            for (Item item : found) {
                output.accept(item.toString());
            }
        } else {
            output.accept("------------ Заявок с именем: '" + name + "' не существует. -----------");
        }
    }
}
