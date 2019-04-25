package ru.job4j.array;

/**
 * Класс для проверки, что слово начинается с префикса.
 *
 * @author Ilya Balov
 * @version 1
 * @since 25.04.2019
 */
public class ArrayChar {
    private char[] data;

    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }

    /**
     * Проверяет, что слово начинается с префикса.
     * @param prefix префикс.
     * @return true, если слово начинается с префикса, в противном случае - false
     */
    public boolean startWith(String prefix) {
        char[] value = prefix.toCharArray();
        if (value.length > data.length) {
            return false;
        }
        for (int i = 0; i < value.length; i++) {
            if (data[i] != value[i]) {
                return false;
            }
        }
        return true;
    }

}
