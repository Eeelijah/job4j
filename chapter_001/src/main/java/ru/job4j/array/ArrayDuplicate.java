package ru.job4j.array;

import java.util.Arrays;

public class ArrayDuplicate {

    public String[] remove(String[] array) {

        int unique = array.length;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                continue;
            }
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    array[j] = null;
                    unique--;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                continue;
            }
            for (int j = i; j < array.length; j++) {
                if (array[j] != null) {
                    array[i] = array[j];
                    array[j] = null;
                    break;
                }
            }
        }

        return Arrays.copyOf(array, unique);
    }
}
