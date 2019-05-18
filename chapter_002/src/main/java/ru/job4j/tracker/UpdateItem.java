package ru.job4j.tracker;

import java.util.function.Consumer;

public class UpdateItem extends BaseAction {

    public UpdateItem(int key, String name) {
        super(key, name);
    }

    @Override
    public void execute(Input input, Tracker tracker, Consumer<String> output) {
        output.accept("------------ Редактирование существующей заявки --------------");
        String id = input.ask("Введите id заявки, которую хотите заменить:", output);
        String name = input.ask("Введите имя новой заявки:", output);
        String desc = input.ask("Введите описание новой заявки:", output);
        Item item = new Item(name, desc, System.currentTimeMillis());
        boolean result = tracker.replace(id, item);
        String out = result ? "------------ Заявка с id: '" + id + "' была успешно заменена. -----------"
                : "------------ Заявки с id: '" + id + "' не существует. -----------";
        output.accept(out);
    }
}
