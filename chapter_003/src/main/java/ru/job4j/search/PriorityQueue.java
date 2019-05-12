package ru.job4j.search;

import java.util.LinkedList;
import java.util.ListIterator;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    public LinkedList<Task> getTasks() {
        return tasks;
    }

    public void put(Task task) {
        if (tasks.size() == 0) {
            tasks.add(0, task);
            return;
        }

        ListIterator<Task> iterator = tasks.listIterator();

        while (iterator.hasNext()) {
            Task next = iterator.next();
            if (next.getPriority() > task.getPriority()) {
                iterator.set(task);
                iterator.add(next);
                break;
            }
        }
    }

    public Task take() {
        return tasks.poll();
    }
}
