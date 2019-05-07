package ru.job4j.tracker;

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
}
