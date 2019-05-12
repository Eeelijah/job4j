package ru.job4j.exam;

public class SortedArraysMerger {

    public int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int lInd = 0;
        int rInd = 0;
        int i = 0;

        while (lInd + rInd != result.length) {
            if (rInd == right.length) {
                System.arraycopy(left, lInd, result, i, left.length - lInd);
                break;
            } else if (lInd == left.length) {
                System.arraycopy(right, rInd, result, i, right.length - rInd);
                break;
            }
            result[i++] = left[lInd] <= right[rInd] ? left[lInd++] : right[rInd++];
        }
        return result;
    }
}
