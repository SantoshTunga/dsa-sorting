package com.dsa.sorting;

public class MergeTwoSortedArrayAuxSpace {

	public static void main(String[] args) {

		/**
		 * In this approach the final result will be stored in a different array , total
		 * Time complexity O(a+b) = O(N) , Space Complexity O(N)
		 **/

		int a[] = { 1, 2, 3, 100 };
		int b[] = { 10, 20, 30 };

		print(merge(a, b));

	}

	public static int[] merge(int[] a, int b[]) {
		int totallength = (a.length + b.length);

		int result[] = new int[totallength];

		int finalIndex = 0;
		int firstIndex = 0;
		int secondIndex = 0;

		/**
		 * Traverse a.len + b.len time , compare both the arrays' elements , push the
		 * smallest to the final array then increment each array index respectively and
		 * in case of uneven size , at the end push only the element of the bigger array
		 * to the final array
		 */

		while (finalIndex < totallength) {

			if (firstIndex < a.length && secondIndex < b.length) {

				if (a[firstIndex] <= b[secondIndex]) {
					result[finalIndex] = a[firstIndex];
					firstIndex++;

				} else {
					result[finalIndex] = b[secondIndex];
					secondIndex++;
				}

			} else if (firstIndex < a.length) {

				result[finalIndex] = a[firstIndex];
				firstIndex++;
			} else if (secondIndex < b.length) {

				result[finalIndex] = b[secondIndex];
				secondIndex++;
			}

			finalIndex++;

		}

		return result;

	}

	public static void print(int[] result) {

		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

	}

}
