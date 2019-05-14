package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class ConvertMatrix2List {

    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        for (int[] row: array) {
            for (int val : row) {
                list.add(val);
            }
        }
        return list;
    }

    public List<Integer> convert(List<int[]> list) {
        List<Integer> result = new ArrayList<>();

        for (int[] array : list) {
            for (int num : array) {
                result.add(num);
            }
        }
        return result;
    }
}
