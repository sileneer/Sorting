package com.sileneer.bubblesort;

/**
 * @Classname: BubbleSort
 * @Description:
 * @author: Liu ZH, Email: yuan95338@gmail.com
 * @date: 7/7/2021 11:30 PM
 * @version: V1.0
 */
public class BubbleSort {
    public static void bubbleSort(int[] arr, int startIndex, int endIndex) {
        for (int i = startIndex; i < endIndex; i++) {
            for (int j = startIndex; j < endIndex - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    private static void swap(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}
