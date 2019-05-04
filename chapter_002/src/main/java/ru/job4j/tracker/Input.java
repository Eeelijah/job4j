package ru.job4j.tracker;

import java.util.List;

/**
 * @author Ilya Balov
 * @version 1
 * @since 28.04.2019
 */
public interface Input {

    /**
     * Метод для общения с пользователем.
     * @param question вопрос, который задается пользователю
     * @return ответ от пользователя
     */
    String ask(String question);

    int ask(String question, List<Integer> range);
}
