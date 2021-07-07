package com.sileneer.quicksort;

/**
 * 
 * @Description Quick sort by using single circulation.
 * @author Liu ZH, Email: lzh7522@foxmail.com
 * @version
 * @date 24 Nov 2020 4:51:12 pm
 *
 */
public class QuickSortSingleCirculation {

	/**
	 * 
	 * @Description Divide the array into two part and sort. Applicable to subarray
	 *              by recursion.
	 * @author Liu ZH
	 * @date 24 Nov 2020 5:07:55 pm
	 * @param arr:        the array to sort
	 * @param startIndex: the index of the starting element
	 * @param endIndex:   the index of the ending element
	 */
	public static void quickSort(int[] arr, int startIndex, int endIndex) {
		// condition of the end of the recursion: when startIndex is larger than or
		// equal to endIndex
		if (startIndex > endIndex) {
			return;
		} else {
			// get the index of the pivot
			int pivotIndex = partition(arr, startIndex, endIndex);
			// according to pivot, divide the array into two part and sort them respectively
			quickSort(arr, startIndex, pivotIndex - 1);
			quickSort(arr, pivotIndex + 1, endIndex);
		}
	}

	/**
	 * 
	 * @Description By using a pointer mark, swap elements if a certain element is
	 *              smaller than pivot, and mark++
	 * @author Liu ZH
	 * @date 24 Nov 2020 5:16:04 pm
	 * @param arr:        the array to sort
	 * @param startIndex: the index of the starting element
	 * @param endIndex:   the index of the ending element
	 * @return mark
	 */
	public static int partition(int[] arr, int startIndex, int endIndex) {
		// use the 1st element as the pivot
		int pivot = arr[startIndex];
		int mark = startIndex;

		// go through the array. if a certain element is smaller than pivot, do:
		// 1. mark++
		// 2. swap this element with the one at pointer mark
		for (int i = startIndex + 1; i <= endIndex; i++) {
			if (arr[i] < pivot) {
				mark++;
				int temp = arr[mark];
				arr[mark] = arr[i];
				arr[i] = temp;
			}
		}
		
		// swap the element at pivot and mark
		arr[startIndex] = arr[mark];
		arr[mark] = pivot;
		return mark;
	}
}
