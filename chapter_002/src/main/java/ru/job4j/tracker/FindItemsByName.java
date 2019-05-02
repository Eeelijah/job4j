package ru.job4j.tracker;

public class FindItemsByName implements UserAction {

    @Override
    public int key() {
        return 5;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Поиск заявки по имени --------------");
        String name = input.ask("Введите имя заявки, которую хотите найти:");
        Item[] found = tracker.findByName(name);
        if (found != null) {
            System.out.println("------------ Найдены заявки: -----------");
            for (Item item : found) {
                System.out.println(item.toString());
            }
        } else {
            System.out.println("------------ Заявок с именем: '" + name + "' не существует. -----------");
        }
    }

    @Override
    public String info() {
        return "5. Найти заявку по имени";
    }
}
