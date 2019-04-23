package ru.job4j.condition;

/**
 * Класс для общения с ботом.
 *
 * @author Ilya Balov
 * @version 1
 * @since 23.04.2019
 */
public class DummyBot {

    /**
     * Отвечает на вопросы.
     *
     * @param question Вопрос от клиента.
     * @return Ответ.
     */
    public String answer(String question) {
        if (question.equals("Привет, Бот.")) {
            return "Привет, умник.";
        } else if (question.equals("Пока.")) {
            return "До скорой встречи.";
        }
        return "Это ставит меня в тупик. Задайте другой вопрос.";
    }
}
