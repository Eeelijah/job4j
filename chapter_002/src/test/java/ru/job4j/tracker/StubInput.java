package ru.job4j.tracker;

import java.util.List;
import java.util.function.Consumer;

public class StubInput implements Input {

    /**
     * Это поле содержит последовательность ответов пользователя.
     * Например. Если пользователь хочет выбрать добавление новой заявки ему нужно ввести:
     * 0 - выбор пункта меня "добавить новую заявку".
     * name - имя заявки
     * desc - описание заявки
     * 6 - выйти из трекера.
     */
    private String[] answers;

    /**
     * Поле считает количество вызовов метода ask.
     * При каждом вызове надо передвинуть указатель на новое число.
     */
    private int position = 0;

    public StubInput(String[] answers) {
        this.answers = answers;
    }

    /**
     * Давайте рассмотрим, как работает этот метод.
     * у нас есть объект в котором содержатся заранее продуманные ответы.
     * При последовательном вызове метода ask нам надо возвращать соответствующие данные.
     * Как если бы мы симулировали поведение пользователя.
     * Для этого при каждом вызове метода ask мы увеличиваем счетчик и
     * при следующем вызове он вернет нам новое значение.
     */
    @Override
    public String ask(String question, Consumer<String> output) {
        return answers[position++];
    }

    @Override
    @SuppressWarnings("Duplicates")
    public int ask(String question, List<Integer> range, Consumer<String> output) {
        int key = Integer.valueOf(this.ask(question, output));
        if (!exist(key, range)) {
            throw new MenuOutException("Out of menu range");
        }
        return key;
    }

    @SuppressWarnings("Duplicates")
    private boolean exist(int key, List<Integer> range) {
        boolean exist = false;
        for (int value : range) {
            if (value == key) {
                exist = true;
                break;
            }
        }
        return exist;
    }
}
