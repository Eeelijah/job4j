package ru.job4j.search;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(425);
        set.add(24);
        set.add(4);
        set.add(67);
        for (Integer val : set) {
            System.out.println(val);
        }
    }
}
