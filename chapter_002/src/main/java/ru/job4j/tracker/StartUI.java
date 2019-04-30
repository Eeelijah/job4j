package ru.job4j.tracker;

/**
 * @author Ilya Balov
 * @version 1
 * @since 28.04.2019
 */
public class StartUI {
    /**
     * Хранилище заявок.
     */
    private Tracker tracker;
    /**
     * Получение данных от пользователя.
     */
    private Input input;
    /**
     * Константа меню для добавления новой заявки.
     */
    private static final String ADD = "0";
    /**
     * Константа меню для показа всех заявок.
     */
    private static final String SHOW_ALL = "1";
    /**
     * Константа меню для редактирования заявки.
     */
    private static final String EDIT = "2";
    /**
     * Константа меню для удаления заявки.
     */
    private static final String DELETE = "3";
    /**
     * Константа меню для поиска заявки по id.
     */
    private static final String FIND_BY_ID = "4";
    /**
     * Константа меню для поиска заявок по имени.
     */
    private static final String FIND_BY_NAME = "5";
    /**
     * Константа для выхода из цикла.
     */
    private static final String EXIT = "6";

    /**
     * Конструтор инициализирующий поля.
     *
     * @param input   ввод данных.
     * @param tracker хранилище заявок.
     */
    public StartUI(Input input, Tracker tracker) {
        this.tracker = tracker;
        this.input = input;
    }

    /**
     * Основной цикл программы.
     */
    public void init() {
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Введите пункт меню:\r\n");
            switch (answer) {
                case ADD:
                    this.createItem();
                    break;
                case SHOW_ALL:
                    this.showAllItems();
                    break;
                case EDIT:
                    this.editItem();
                    break;
                case DELETE:
                    this.deleteItem();
                    break;
                case FIND_BY_ID:
                    this.findById();
                    break;
                case FIND_BY_NAME:
                    this.findByName();
                    break;
                case EXIT:
                    System.out.println("------------ Завершение работы программы... --------------");
                    exit = true;
                    break;
                default:
                    System.out.println("Неправильный ввод, повторите еще раз.");
            }
        }
    }

    /**
     * Метод реализует добавление новой заявки в хранилище.
     */
    private void createItem() {
        System.out.println("------------ Добавление новой заявки --------------");
        String name = input.ask("Введите имя заявки:");
        String desc = input.ask("Введите описание заявки:");
        Item item = new Item(name, desc, System.currentTimeMillis());
        tracker.add(item);
        System.out.println("------------ Новая заявка с id: '" + item.getId() + "' -----------");
    }

    /**
     * Метод реализует удаление существующей заявки из хранилища.
     */
    private void deleteItem() {
        System.out.println("------------ Удаление существующей заявки --------------");
        String id = input.ask("Введите id заявки, которую хотите удалить:");
        boolean result = tracker.delete(id);
        String output = result ? "------------ Заявка с id: '" + id + "' была успешно удалена. -----------" :
                "------------ Заявки с id: " + id + " не существует. -----------";
        System.out.println(output);
    }

    /**
     * Метод реализует отображение всех заявок из хранилища.
     */
    private void showAllItems() {
        System.out.println("------------ Вывод всех заявок --------------");
        Item[] items = tracker.findAll();
        for (Item item : items) {
            System.out.println(item.toString());
        }
    }

    /**
     * Метод реализует редактирование заявки в хранилище.
     */
    private void editItem() {
        System.out.println("------------ Редактирование существующей заявки --------------");
        String id = input.ask("Введите id заявки, которую хотите заменить:");
        String name = input.ask("Введите имя новой заявки:");
        String desc = input.ask("Введите описание новой заявки:");
        Item item = new Item(name, desc, System.currentTimeMillis());
        boolean result = tracker.replace(id, item);
        String output = result ? "------------ Заявка с id: '" + id + "' была успешно заменена. -----------" :
                "------------ Заявки с id: '" + id + "' не существует. -----------";
        System.out.println(output);
    }

    /**
     * Метод реализует поиск заявки в хранилище по id.
     */
    private void findById() {
        System.out.println("------------ Поиск заявки по id --------------");
        String id = input.ask("Введите id заявки, которую хотите найти:");
        Item item = tracker.findById(id);
        String output = item != null ? "------------ Найдена заявка: " + item.toString() + ". -----------" :
                "------------ Заявки с id: '" + id + "' не существует. -----------";
        System.out.println(output);
    }

    /**
     * Метод реализует поиск заявки в хранилище по имени.
     */
    private void findByName() {
        System.out.println("------------ Поиск заявки по имени --------------");
        String name = input.ask("Введите имя заявки, которую хотите найти:");
        Item[] found = tracker.findByName(name);
        if (found != null) {
            System.out.println("------------ Найдены заявки: -----------");
            for (Item item : found) {
                System.out.println(item.toString());
            }
        } else {
            System.out.println("------------ Заявок с именем: '" + name + "' не существует. -----------");
        }
    }

    /**
     * Метод для отображения меню пользователю.
     */
    private void showMenu() {
        System.out.println("\r\nМЕНЮ ВЫБОРА:");
        System.out.println("0. Добавить новую заявку");
        System.out.println("1. Показать все заявки");
        System.out.println("2. Редактировать заявку");
        System.out.println("3. Удалить заявку");
        System.out.println("4. Найти заявку по id");
        System.out.println("5. Найти заявку по имени");
        System.out.println("6. Выйти из программы");
    }

    /**
     * Запуск программы.
     *
     * @param args аргументы запуска
     */
    public static void main(String[] args) {
        Input input = new ConsoleInput();
        new StartUI(input, new Tracker()).init();
    }
}
