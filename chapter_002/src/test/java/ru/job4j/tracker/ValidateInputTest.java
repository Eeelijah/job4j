package ru.job4j.tracker;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.After;


import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class ValidateInputTest {
    private final ByteArrayOutputStream mem = new ByteArrayOutputStream();
    private final PrintStream out = System.out;

    @Before
    public void loadMem() {
        System.setOut(new PrintStream(this.mem));
    }

    @After
    public void loadSys() {
        System.setOut(out);
    }

    @Test
    public void whenInvalidInput() {
        ValidateInput input = new ValidateInput(new StubInput(new String[]{"invalid", "1"}));
        List<Integer> range = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            range.add(i);
        }
        input.ask("Enter", range);
        assertThat(this.mem.toString(), is("Вы ввели текст. Пожалуйста повторите ввод пункта меню.\r\n")
        );
    }

    @Test
    public void whenInputIsNotInRange() {
        ValidateInput input = new ValidateInput(new StubInput(new String[]{"8", "1"}));
        List<Integer> range = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            range.add(i);
        }
        input.ask("Enter", range);
        assertThat(this.mem.toString(), is("Выбран неверный пункт меню. Повторите снова.\r\n")
        );
    }
}
