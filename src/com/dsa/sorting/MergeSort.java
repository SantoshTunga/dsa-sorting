package com.dsa.sorting;

public class MergeSort {

	public static void main(String[] arg) {

		int a[] = { 1, -2, 89, 100, 23, 65 };

		processMergeSort(a);
		print(a);
	}

	public static void processMergeSort(int[] a) {

		/**
		 * break the given array in two parts till it reaches the pair of 2 elements ,
		 * swap the elements in the ascending order .merge with left and right array as
		 * per the ascending order and keep the elements in the final array.
		 **/
		/*
		 * Advantages of merge sort:
		 * 
		 * Merge sort is a stable sorting algorithm, which means it preserves the
		 * relative order of equal elements in the input array. Merge sort has a
		 * guaranteed worst-case time complexity of O(n log n), which means it performs
		 * well even on large datasets. Merge sort is a naturally parallelizable
		 * algorithm, which means it can be easily parallelized to take advantage of
		 * multiple processors or threads.
		 * 
		 * Disadvantages of merge sort:
		 * 
		 * Merge sort requires additional memory to store the two sorted halves of the
		 * array while they are being merged. Merge sort can be slower than other
		 * sorting algorithms, such as quicksort, on small datasets.
		 */
		if (a.length <= 1) {
			return;
		} else if (a.length == 2) {

			if (a[0] > a[1]) {
				int t = a[0];
				a[0] = a[1];
				a[1] = t;
				return;
			}

		}

		int mid = a.length / 2;
		int[] left = new int[mid];
		int[] right = new int[a.length - mid];

		System.arraycopy(a, 0, left, 0, left.length);
		System.arraycopy(a, mid, right, 0, right.length);

		processMergeSort(left);
		processMergeSort(right);

		merge(a, left, right);

	}

	public static void merge(int[] a, int left[], int right[]) {

		int leftIndex = 0;
		int rightIndex = 0;
		int currentIndex = 0;

		while (currentIndex < a.length) {

			if (leftIndex < left.length && rightIndex < right.length) {
				if (left[leftIndex] <= right[rightIndex]) {
					a[currentIndex] = left[leftIndex];
					leftIndex++;

				} else {
					a[currentIndex] = right[rightIndex];
					rightIndex++;
				}
			} else if (leftIndex < left.length) {
				a[currentIndex] = left[leftIndex];
				leftIndex++;
			} else if (rightIndex < right.length) {
				a[currentIndex] = right[rightIndex];
				rightIndex++;
			}

			currentIndex++;
		}

	}

	public static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
