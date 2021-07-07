package com.sileneer.bubblesort;

import java.util.Arrays;

/**
 * @Classname: BubbleSortTest
 * @Description:
 * @author: Liu ZH, Email: yuan95338@gmail.com
 * @date: 7/7/2021 11:30 PM
 * @version: V1.0
 */
public class BubbleSortTest {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 8, 1, 3, 6, 7, 5, 4};
        BubbleSort.bubbleSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
