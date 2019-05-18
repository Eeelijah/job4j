package ru.job4j.tracker;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ValidateInputTest {

    private ByteArrayOutputStream out = new ByteArrayOutputStream();
    private final Consumer<String> output = new Consumer<>() {
        private PrintStream stdout = new PrintStream(out);

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
    public void whenInvalidInput() {
        ValidateInput input = new ValidateInput(new StubInput(new String[]{"invalid", "1"}));
        List<Integer> range = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            range.add(i);
        }
        input.ask("Enter", range, this.output);
        assertThat(this.output.toString(), is(String.format("Вы ввели текст. Пожалуйста повторите ввод пункта меню.%s", System.lineSeparator())));
    }

    @Test
    public void whenInputIsNotInRange() {
        ValidateInput input = new ValidateInput(new StubInput(new String[]{"8", "1"}));
        List<Integer> range = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            range.add(i);
        }
        input.ask("Enter", range, this.output);
        assertThat(this.output.toString(), is(String.format("Выбран неверный пункт меню. Повторите снова.%s", System.lineSeparator())));
    }
}
