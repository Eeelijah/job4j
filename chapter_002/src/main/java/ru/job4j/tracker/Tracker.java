package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ilya Balov
 * @version 1
 * @since 28.04.2019
 */
public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private final List<Item> items = new ArrayList<>();

    /**
     * Метод, реализаущий добавление заявки в хранилище.
     *
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId(item.getTime()));
        this.items.add(item);
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
        boolean result = false;
        int index = findIndexById(id);
        if (item != null && index != -1) {
            item.setId(id);
            items.set(index, item);
            result = true;
        }
        return result;
    }

    /**
     * Удаляет объект с указанным id в массиве items.
     *
     * @param id уникальный ключ
     * @return boolean - удалось ли удалить объект
     */
    public boolean delete(String id) {
        boolean result = false;
        int index = findIndexById(id);
        if (index != -1) {
            items.remove(index);
            result = true;
        }
        return result;
    }

    /**
     * Метод для получение списка всех ненулевых заявок из массива items.
     *
     * @return массив с существующими заявками
     */
    public List<Item> findAll() {
        return this.items;
    }

    /**
     * Метод получения списка по имени заявки.
     *
     * @param name имя
     * @return массив заявок из items с заданным именем
     */
    public List<Item> findByName(String name) {
        if (name == null) {
            return null;
        }
        List<Item> result = new ArrayList<>();

        for (Item item : items) {
            if (item != null && item.getName().equals(name)) {
                result.add(item);
            }
        }
        return result;
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
        return items.get(index);
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */
    private String generateId(long time) {
        return (int) ((Math.random() * 100)) * time + "";
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
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i) != null && id.equals(items.get(i).getId())) {
                index = i;
                break;
            }
        }
        return index;
    }
}
