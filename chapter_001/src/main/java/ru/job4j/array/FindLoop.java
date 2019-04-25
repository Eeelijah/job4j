package ru.job4j.array;

/**
 * Класс для поиска индекса элемента.
 *
 * @author Ilya Balov
 * @version 1
 * @since 25.04.2019
 */
public class FindLoop {

    /**
     * Метод для поиска индекса элемента.
     * @param data массив
     * @param el искомый элемент
     * @return индекс элемента
     */
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }
}
