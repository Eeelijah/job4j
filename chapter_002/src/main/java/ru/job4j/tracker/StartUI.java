package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ilya Balov
 * @version 1
 * @since 28.04.2019
 */
public class StartUI {
    /**
     * Хранилище заявок.
     */
    private Tracker tracker;
    /**
     * Получение данных от пользователя.
     */
    private Input input;

    /**
     * Конструтор инициализирующий поля.
     *
     * @param input   ввод данных.
     * @param tracker хранилище заявок.
     */
    public StartUI(Input input, Tracker tracker) {
        this.tracker = tracker;
        this.input = input;
    }

    /**
     * Основной цикл программы.
     */
    public void init() {
        MenuTracker menu = new MenuTracker(this.input, this.tracker);
        menu.fillActions();
        List<Integer> range = new ArrayList<>();
        for (int i = 0; i < menu.getActionsLentgh(); i++) {
            range.add(i);
        }
        boolean exit = false;
        while (!exit) {
            menu.show();
            int choice =this.input.ask("Введите пункт меню:\r\n", range);
            menu.select(choice);
            exit = choice == 6;
        }
    }

    /**
     * Запуск программы.
     *
     * @param args аргументы запуска
     */
    public static void main(String[] args) {
        Input input = new ValidateInput();
        new StartUI(input, new Tracker()).init();
    }
}
