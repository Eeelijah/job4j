package ru.job4j.tracker;

import java.util.List;
import java.util.function.Consumer;

/**
 * @author Ilya Balov
 * @version 1
 * @since 28.04.2019
 */
public interface Input {

    /**
     * Метод для общения с пользователем.
     *
     * @param question вопрос, который задается пользователю
     * @return ответ от пользователя
     */
    String ask(String question, Consumer<String> output);

    int ask(String question, List<Integer> range, Consumer<String> output);
}
