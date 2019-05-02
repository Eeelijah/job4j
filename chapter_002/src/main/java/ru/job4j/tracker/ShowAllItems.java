package ru.job4j.tracker;

public class ShowAllItems implements UserAction {

    @Override
    public int key() {
        return 1;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Вывод всех заявок --------------");
        Item[] items = tracker.findAll();
        for (Item item : items) {
            System.out.println(item.toString());
        }
    }

    @Override
    public String info() {
        return "1. Показать все заявки";
    }
}
