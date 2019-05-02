package ru.job4j.tracker;

public class FindItemById implements UserAction {

    @Override
    public int key() {
        return 4;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Поиск заявки по id --------------");
        String id = input.ask("Введите id заявки, которую хотите найти:");
        Item item = tracker.findById(id);
        String output = item != null ? "------------ Найдена заявка: " + item.toString() + ". -----------"
                : "------------ Заявки с id: '" + id + "' не существует. -----------";
        System.out.println(output);
    }

    @Override
    public String info() {
        return "4. Найти заявку по id";
    }
}
