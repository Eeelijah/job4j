package ru.job4j.tracker;

public class UpdateItem implements UserAction {

    @Override
    public int key() {
        return 2;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Редактирование существующей заявки --------------");
        String id = input.ask("Введите id заявки, которую хотите заменить:");
        String name = input.ask("Введите имя новой заявки:");
        String desc = input.ask("Введите описание новой заявки:");
        Item item = new Item(name, desc, System.currentTimeMillis());
        boolean result = tracker.replace(id, item);
        String output = result ? "------------ Заявка с id: '" + id + "' была успешно заменена. -----------"
                : "------------ Заявки с id: '" + id + "' не существует. -----------";
        System.out.println(output);
    }

    @Override
    public String info() {
        return "2. Редактировать заявку";
    }
}
