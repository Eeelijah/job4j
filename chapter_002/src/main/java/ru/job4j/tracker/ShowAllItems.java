package ru.job4j.tracker;

public class ShowAllItems extends BaseAction {

    public ShowAllItems(int key, String name) {
        super(key, name);
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Вывод всех заявок --------------");
        Item[] items = tracker.findAll();
        for (Item item : items) {
            System.out.println(item.toString());
        }
    }
}
