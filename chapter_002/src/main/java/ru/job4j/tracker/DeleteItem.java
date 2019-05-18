package ru.job4j.tracker;

import java.util.function.Consumer;

public class DeleteItem extends BaseAction {

    public DeleteItem(int key, String name) {
        super(key, name);
    }

    @Override
    public void execute(Input input, Tracker tracker, Consumer<String> output) {
        output.accept("------------ Удаление существующей заявки --------------");
        String id = input.ask("Введите id заявки, которую хотите удалить:", output);
        boolean result = tracker.delete(id);
        String out = result ? "------------ Заявка с id: '" + id + "' была успешно удалена. -----------"
                : "------------ Заявки с id: " + id + " не существует. -----------";
        output.accept(out);
    }
}
