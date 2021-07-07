package com.sileneer.mergesort;

import java.util.Arrays;

/**
 * @Classname: MergeSort
 * @Description:
 * @author: Liu ZH, Email: yuan95338@gmail.com
 * @date: 7/7/2021 9:53 AM
 * @version: V1.0
 */
public class MergeSort {
    /**
     * @Description: Separate the array into different subarray and merge them back
     * @author: Liu ZH
     * @date: 7/7/2021 11:10 PM
     * @param arr: the array (passed by reference)
     * @param startIndex: the start index of the array to sort
     * @param endIndex: the end index of the array to sort
     */
    protected static void mergeSort(int[] arr, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }

        // get the middle index between the two subarray
        int middleIndex = startIndex + (endIndex - startIndex) / 2;

        // recursion until the array is seperated into subarray with one element
        mergeSort(arr, startIndex, middleIndex);
        mergeSort(arr, middleIndex + 1, endIndex);

        // merge the subarray back to the original array
        merge(arr, startIndex, middleIndex, endIndex);
    }

    /**
     * @Description: Merge the two subarray into one array according to the numerical value
     * @author: Liu ZH
     * @date: 7/7/2021 11:06 PM
     * @param arr: the array (passed by reference)
     * @param startIndex: the start index of the first subarray
     * @param middleIndex: the end index of the first subarray (the start of the second array - 1)
     * @param endIndex: the end index of the second subarray
     */
    private static void merge(int[] arr, int startIndex, int middleIndex, int endIndex) {
        // Get the two subarray. Or use for loops.
        int[] leftArr = Arrays.copyOfRange(arr, startIndex, middleIndex + 1);
        int[] rightArr = Arrays.copyOfRange(arr, middleIndex + 1, endIndex + 1);

        // i: the index of the first array. We are going to iterate the array using i.
        // j: the index of the second array. We are going to iterate the array using j.
        // k: the index of the merged array.
        int i = 0, j = 0, k = startIndex;

        // iterate the two subarray and get the smaller term between leftArr[i] and rightArr[j]. Add them to the original array.
        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // Add the remaining of leftArr and rightArr to the original array
        while (i < leftArr.length) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < rightArr.length) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}
