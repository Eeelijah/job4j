package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for DummyBot class.
 *
 * @author Ilya Balov
 * @version 23.04.2015
 * @since 1
 */
public class DummyBotTest {

    /**
     * Test answer method when greeting.
     */
    @Test
    public void whenGreetBot() {
        DummyBot bot = new DummyBot();
        assertThat(bot.answer("Привет, Бот."), is("Привет, умник."));
    }

    /**
     * Test answer method when say bye.
     */
    @Test
    public void whenByeBot() {
        DummyBot bot = new DummyBot();
        assertThat(bot.answer("Пока."), is("До скорой встречи."));
    }

    /**
     * Test answer method when unknown question.
     */
    @Test
    public void whenUnknownBot() {
        DummyBot bot = new DummyBot();
        assertThat(bot.answer("Сколько будет 2 + 2?"), is("Это ставит меня в тупик. Задайте другой вопрос."));
    }
}
