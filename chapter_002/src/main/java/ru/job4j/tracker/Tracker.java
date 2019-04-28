package ru.job4j.tracker;

import java.util.Arrays;

/**
 * @author Ilya Balov
 * @version 1
 * @since 28.04.2019
 */
public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод, реализаущий добавление заявки в хранилище.
     *
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId(item.getTime()));
        this.items[this.position++] = item;
        return item;
    }

    /**
     * Заменяет объект с уникальным ключем id в массиве items новым объектом item.
     *
     * @param id   уникальный ключ
     * @param item новый объект, который должен быть заменен в items
     * @return boolean - удалось ли заменить объект
     */
    public boolean replace(String id, Item item) {
        if (item == null) {
            return false;
        }
        int index = findIndexById(id);
        if (index == -1) {
            return false;
        }
        items[index] = item;
        return true;
    }

    /**
     * Удаляет объект с указанным id в массиве items.
     *
     * @param id уникальный ключ
     * @return boolean - удалось ли удалить объект
     */
    public boolean delete(String id) {
        int index = findIndexById(id);
        if (index == -1) {
            return false;
        }
        items[index] = null;
        System.arraycopy(items, index + 1, items, index, items.length - index - 1);
        return true;
    }

    /**
     * Метод для получение списка всех ненулевых заявок из массива items.
     *
     * @return массив с существующими заявками
     */
    public Item[] findAll() {
        Item[] result = new Item[100];
        int count = 0;
        for (Item item : items) {
            if (item != null) {
                result[count] = item;
                count++;
            }
        }
        return Arrays.copyOf(result, count);
    }

    /**
     * Метод получения списка по имени заявки.
     *
     * @param name имя
     * @return массив заявок из items с заданным именем
     */
    public Item[] findByName(String name) {
        if (name == null) {
            return null;
        }
        Item[] result = new Item[100];
        int count = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null && items[i].getName().equals(name)) {
                result[count] = items[i];
                count++;
            }
        }
        return Arrays.copyOf(result, count);
    }

    /**
     * Метод получения заявки по id.
     *
     * @param id уникальный ключ
     * @return item с указанным id или null
     */
    public Item findById(String id) {
        int index = findIndexById(id);
        if (index == -1) {
            return null;
        }
        return items[index];
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */
    private String generateId(long time) {
        return time * Math.random() + "";
    }

    /**
     * Метод для поиска номера ячейки в массиве items по уникальному ключу id.
     *
     * @param id уникальный ключ
     * @return номер ячейки или -1, если такого объекта не нашлось
     */
    private int findIndexById(String id) {
        int index = -1;
        if (id == null) {
            return index;
        }
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null && id.equals(items[i].getId())) {
                index = i;
                break;
            }
        }
        return index;
    }
}
