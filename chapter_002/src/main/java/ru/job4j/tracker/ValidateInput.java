package ru.job4j.tracker;

import java.util.List;
import java.util.function.Consumer;

public class ValidateInput implements Input {

    private final Input input;

    public ValidateInput(final Input input) {
        this.input = input;
    }

    @Override
    public String ask(String question, Consumer<String> output) {
        return this.input.ask(question, output);
    }

    @Override
    public int ask(String question, List<Integer> range, Consumer<String> output) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = this.input.ask(question, range, output);
                invalid = false;
            } catch (MenuOutException e) {
                output.accept("Выбран неверный пункт меню. Повторите снова.");
            } catch (NumberFormatException e) {
                output.accept("Вы ввели текст. Пожалуйста повторите ввод пункта меню.");
            }
        } while (invalid);
        return value;
    }
}
