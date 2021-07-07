package com.sileneer.mergesort;

import java.util.Arrays;

public class MergeSortTest {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 8, 1, 3, 6, 7, 5, 4};
        MergeSort.mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
