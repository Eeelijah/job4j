package ru.job4j.tracker;

public class DeleteItem extends BaseAction {

    public DeleteItem(int key, String name) {
        super(key, name);
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Удаление существующей заявки --------------");
        String id = input.ask("Введите id заявки, которую хотите удалить:");
        boolean result = tracker.delete(id);
        String output = result ? "------------ Заявка с id: '" + id + "' была успешно удалена. -----------"
                : "------------ Заявки с id: " + id + " не существует. -----------";
        System.out.println(output);
    }
}
