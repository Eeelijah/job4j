package ru.job4j.tracker;

import java.util.List;
import java.util.Scanner;

/**
 * @author Ilya Balov
 * @version 1
 * @since 28.04.2019
 */
public class ConsoleInput implements Input {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public String ask(String question) {
        System.out.println(question);
        return scanner.nextLine();
    }

    @Override
    @SuppressWarnings("Duplicates")
    public int ask(String question, List<Integer> range) {
        int key = Integer.valueOf(this.ask(question));
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
