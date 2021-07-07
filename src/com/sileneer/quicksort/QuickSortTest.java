package com.sileneer.quicksort;

import com.sileneer.quicksort.QuickSortDoubleCirculation;
import com.sileneer.quicksort.QuickSortSingleCirculation;

import java.util.Arrays;

public class QuickSortTest {
    public static void main(String[] args) {
        int[] arr1 = new int[]{4, 4, 6, 5, 3, 2, 8, 1};
        QuickSortDoubleCirculation.quickSort(arr1, 0, arr1.length - 1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = new int[]{4, 4, 6, 5, 3, 2, 8, 1};
        QuickSortSingleCirculation.quickSort(arr2, 0, arr2.length - 1);
        System.out.println(Arrays.toString(arr2));
    }
}
