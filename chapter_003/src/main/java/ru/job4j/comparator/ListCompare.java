package ru.job4j.comparator;

import java.util.Comparator;

public class ListCompare implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        int length = left.length() < right.length() ? left.length() : right.length();
        int result = 0;

        for (int i = 0; i < length; i++) {
            result = Integer.compare(left.charAt(i), right.charAt(i));
            if (result != 0) {
                break;
            }
        }

        if (result == 0) {
            result = Integer.compare(left.length(), right.length());
        }
        return result;
    }
}
