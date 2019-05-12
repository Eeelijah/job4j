package ru.job4j.list;

import java.util.List;

public class ConvertList2Array {

    public int[][] toArray(List<Integer> list, int rows) {
        int cells = (list.size() / rows);
        if (list.size() % rows != 0) {
            cells++;
        }

        int[][] array = new int[rows][cells];
        int row = 0;
        int cell = 0;

        for (Integer num : list) {
            if (cell == cells) {
                cell = 0;
                row++;
            }
            array[row][cell++] = num;
        }
        return array;
    }
}
