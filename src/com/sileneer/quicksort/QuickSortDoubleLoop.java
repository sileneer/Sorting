package com.sileneer.quicksort;

/**
 * 
 * @Description Quick sort by using double circulation.
 * @author Liu ZH, Email: lzh7522@foxmail.com
 * @version 1.0
 * @date 24 Nov 2020 4:39:53 pm
 *
 */
public class QuickSortDoubleLoop {

	/**
	 * 
	 * @Description Divide the array into two part and sort. Applicable to subarray
	 *              by recursion.
	 * @author Liu ZH
	 * @date 24 Nov 2020 4:37:35 pm
	 * @param arr:        the array to sort
	 * @param startIndex: the index of the starting element
	 * @param endIndex:   the index of the ending element
	 */
	protected static void quickSort(int[] arr, int startIndex, int endIndex) {
		// condition of the end of the recursion: when startIndex is larger than or
		// equal to endIndex
		if (startIndex >= endIndex) {
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
	 * @Description By using two pointer left and right, swap elements at the left
	 *              and right if arr[left]>pivot && arr[right]<pivot
	 * @author Liu ZH
	 * @date 24 Nov 2020 4:42:05 pm
	 * @param arr:        the array to sort
	 * @param startIndex: the index of the starting element
	 * @param endIndex:   the index of the ending element
	 * @return left
	 */
	public static int partition(int[] arr, int startIndex, int endIndex) {
		// use the 1st element as the pivot
		int pivot = arr[startIndex];
		int left = startIndex;
		int right = endIndex;
		
		while (left != right) {
			// control the right pointer and shift it left
			while (left < right && arr[right] > pivot) {
				right--;
			}
			// control the left pointer and shift it right
			while (left < right && arr[left] <= pivot) {
				left++;
			}
			// swap the element at left and right
			if (left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
		}
		
		// swap the element at pivot and coincident point
		arr[startIndex] = arr[left];
		arr[left] = pivot;
		return left;
	}
}
