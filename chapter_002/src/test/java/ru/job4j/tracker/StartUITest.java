package ru.job4j.tracker;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.function.Consumer;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;

public class StartUITest {

    private PrintStream stdout = System.out;
    private ByteArrayOutputStream out = new ByteArrayOutputStream();

    private final Consumer<String> output = new Consumer<String>() {
        private final PrintStream stdout = new PrintStream(out);

        @Override
        public void accept(String s) {
            stdout.println(s);
        }

        @Override
        public String toString() {
            return out.toString();
        }
    };

    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});
        new StartUI(input, tracker, output).init();
        assertThat(tracker.findAll().get(0).getName(), is("test name"));
    }

    @Test
    public void whenUpdateThenTrackerHasUpdatedValue() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test name", "desc", System.currentTimeMillis()));
        Input input = new StubInput(new String[]{"2", item.getId(), "test replace", "заменили заявку", "6"});
        new StartUI(input, tracker, output).init();
        assertThat(tracker.findById(item.getId()).getName(), is("test replace"));
    }

    @Test
    public void whenDeleteThenTrackerHasNoSuchValue() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test name", "desc", System.currentTimeMillis()));
        Input input = new StubInput(new String[]{"3", item.getId(), "6"});
        new StartUI(input, tracker, output).init();
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }

    @Test
    public void whenShowAllItems() {
        Tracker tracker = new Tracker();
        Item item1 = tracker.add(new Item("test name1", "desc1", System.currentTimeMillis()));
        Item item2 = tracker.add(new Item("test name2", "desc2", System.currentTimeMillis()));
        Item item3 = tracker.add(new Item("test name3", "desc3", System.currentTimeMillis()));
        Input input = new StubInput(new String[]{"1", "6"});
        new StartUI(input, tracker, output).init();
        String separator = System.lineSeparator();

        assertThat(
                this.output.toString(),
                is(
                        new StringBuilder()
                                .append(separator)
                                .append("МЕНЮ ВЫБОРА:").append(separator)
                                .append("0. Добавить новую заявку").append(separator)
                                .append("1. Показать все заявки").append(separator)
                                .append("2. Редактировать заявку").append(separator)
                                .append("3. Удалить заявку").append(separator)
                                .append("4. Найти заявку по id").append(separator)
                                .append("5. Найти заявку по имени").append(separator)
                                .append("6. Выйти из программы").append(separator)
                                .append("------------ Вывод всех заявок --------------").append(separator)
                                .append(item1.toString()).append(separator)
                                .append(item2.toString()).append(separator)
                                .append(item3.toString()).append(separator)
                                .append(separator)
                                .append("МЕНЮ ВЫБОРА:").append(separator)
                                .append("0. Добавить новую заявку").append(separator)
                                .append("1. Показать все заявки").append(separator)
                                .append("2. Редактировать заявку").append(separator)
                                .append("3. Удалить заявку").append(separator)
                                .append("4. Найти заявку по id").append(separator)
                                .append("5. Найти заявку по имени").append(separator)
                                .append("6. Выйти из программы").append(separator)
                                .append("------------ Завершение работы программы... --------------").append(separator)
                                .toString()
                )
        );
    }

    @Test
    public void whenFindById() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test name1", "desc1", System.currentTimeMillis()));
        Input input = new StubInput(new String[]{"4", item.getId(), "6"});
        new StartUI(input, tracker, output).init();
        String separator = System.lineSeparator();

        assertThat(
                this.output.toString(),
                is(
                        new StringBuilder()
                                .append(separator)
                                .append("МЕНЮ ВЫБОРА:").append(separator)
                                .append("0. Добавить новую заявку").append(separator)
                                .append("1. Показать все заявки").append(separator)
                                .append("2. Редактировать заявку").append(separator)
                                .append("3. Удалить заявку").append(separator)
                                .append("4. Найти заявку по id").append(separator)
                                .append("5. Найти заявку по имени").append(separator)
                                .append("6. Выйти из программы").append(separator)
                                .append("------------ Поиск заявки по id --------------").append(separator)
                                .append("------------ Найдена заявка: " + item.toString() + ". -----------").append(separator)
                                .append(separator)
                                .append("МЕНЮ ВЫБОРА:").append(separator)
                                .append("0. Добавить новую заявку").append(separator)
                                .append("1. Показать все заявки").append(separator)
                                .append("2. Редактировать заявку").append(separator)
                                .append("3. Удалить заявку").append(separator)
                                .append("4. Найти заявку по id").append(separator)
                                .append("5. Найти заявку по имени").append(separator)
                                .append("6. Выйти из программы").append(separator)
                                .append("------------ Завершение работы программы... --------------").append(separator)
                                .toString()
                )
        );
    }

    @Test
    public void whenFindByName() {
        Tracker tracker = new Tracker();
        Item item1 = tracker.add(new Item("test name1", "desc1", System.currentTimeMillis()));
        Item item2 = tracker.add(new Item("test name1", "desc2", System.currentTimeMillis()));
        Item item3 = tracker.add(new Item("test name3", "desc3", System.currentTimeMillis()));
        Input input = new StubInput(new String[]{"5", item1.getName(), "6"});
        new StartUI(input, tracker, output).init();
        String separator = System.lineSeparator();

        assertThat(
                this.output.toString(),
                is(
                        new StringBuilder()
                                .append(separator)
                                .append("МЕНЮ ВЫБОРА:").append(separator)
                                .append("0. Добавить новую заявку").append(separator)
                                .append("1. Показать все заявки").append(separator)
                                .append("2. Редактировать заявку").append(separator)
                                .append("3. Удалить заявку").append(separator)
                                .append("4. Найти заявку по id").append(separator)
                                .append("5. Найти заявку по имени").append(separator)
                                .append("6. Выйти из программы").append(separator)
                                .append("------------ Поиск заявки по имени --------------").append(separator)
                                .append("------------ Найдены заявки: -----------").append(separator)
                                .append(item1.toString()).append(separator)
                                .append(item2.toString()).append(separator)
                                .append(separator)
                                .append("МЕНЮ ВЫБОРА:").append(separator)
                                .append("0. Добавить новую заявку").append(separator)
                                .append("1. Показать все заявки").append(separator)
                                .append("2. Редактировать заявку").append(separator)
                                .append("3. Удалить заявку").append(separator)
                                .append("4. Найти заявку по id").append(separator)
                                .append("5. Найти заявку по имени").append(separator)
                                .append("6. Выйти из программы").append(separator)
                                .append("------------ Завершение работы программы... --------------").append(separator)
                                .toString()
                )
        );
    }
}
