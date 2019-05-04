package ru.job4j.tracker;

import java.util.List;

public class ValidateInput extends ConsoleInput {

    @Override
    public int ask(String question, List<Integer> range) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = super.ask(question, range);
                invalid = false;
            } catch (MenuOutException e) {
                System.out.println("Выбран неверный пункт меню. Повторите снова.");
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели текст. Пожалуйста повторите ввод пункта меню.");
            }
        } while (invalid);
        return value;
    }
}
