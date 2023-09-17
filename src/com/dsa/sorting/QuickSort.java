package com.dsa.sorting;

public class QuickSort {

	public static void main(String[] args) {

		/*
		 * quick sort works by dividing the array in two parts based on a pivot point
		 * one is lesser than and other is greater than it recursively called till all
		 * the elements are sorted .
		 * 
		 */

		/*
		 * how to choose your pivot point - better to take the median of the array
		 * Max(first , Min( mid, Last element)) to avoid the worst case
		 */

		/*
		 * This algorithm has a time complexity of O(n log n) in the average case and
		 * O(n^2) in the worst case. In practice, it is one of the fastest sorting
		 * algorithms available.
		 */

		int[] arr = { 100, 1, 1, 78, 34, 90, -1, -20, 0 };

		quicksort(arr, 0, arr.length - 1);
		print(arr);

	}

	public static void quicksort(int[] a, int l, int h) {
		if (l >= h) {
			return;
		}
		/*
		 * Initially keep both the pointer away from the array as Do while loop is used
		 * and there is a reason why do while loop is used , to move the pointers ( I &
		 * J ) appropriately in case of same elements to avoid infinite loop.
		 */

		int i = l - 1;
		int j = h + 1;
		int p = Math.max(a[l], Math.min(a[(l + h) / 2], a[h]));

		while (true) {

			do {
				i++;
			} while (a[i] < p);

			do {
				j--;
			} while (a[j] > p);

			if (i >= j) {
				break;
			}
			int t = a[i];
			a[i] = a[j];
			a[j] = t;
		}

		quicksort(a, l, i - 1);
		quicksort(a, j + 1, h);

	}

	public static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
