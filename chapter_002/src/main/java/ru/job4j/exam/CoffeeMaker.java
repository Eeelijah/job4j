package ru.job4j.exam;

import java.util.Arrays;

public class CoffeeMaker {
    private Integer [] COINS = {10, 5, 2, 1};

    public int[] changes(int bill, int price) {
        int rest = bill - price;
        Arrays.sort(COINS, (o1, o2) -> Integer.compare(o2, o1));

        int[] count = new int[COINS.length];
        for (int i = 0; i < COINS.length; i++) {
            count[i] = rest / COINS[i];
            rest -= COINS[i] * count[i];
        }

        int resultSize = 0;
        for (int i : count) {
            resultSize += i;
        }
        int[] result = new int[resultSize];

        int lastIndex = 0;
        for (int i = 0; i < COINS.length; i++) {
            addChange(result, COINS[i], count[i], lastIndex);
            lastIndex += count[i];
        }
        return result;
    }

    private int[] addChange(int[] array, int coin, int count, int lastIndex) {
        for (int i = lastIndex; i < count + lastIndex; i++) {
            array[i] = coin;
        }
        return array;
    }
}
