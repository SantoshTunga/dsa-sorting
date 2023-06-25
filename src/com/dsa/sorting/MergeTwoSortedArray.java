package com.dsa.sorting;

public class MergeTwoSortedArray {

	/**
	 * In this example , the final result is pushed to first array which is having
	 * more size this case is suitable for the scenario where you know the array not
	 * empty size . Complexity O(m+n ) => O(n) where n is the total number of
	 * elements , space complexity O(1)
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int[] nums1 = { 1, 5, 8, 0, 0, 0, 0 };
		int[] nums2 = { 2, 3, 6, 9 };
		int nums1Len = 3; // this is main part , it is known before
		int nums2Len = 4;

		merge(nums1, nums1Len, nums2, nums2Len);

		for (int i = 0; i < nums1.length; i++) {
			System.out.println(" result : " + nums1[i]);
		}

	}

	public static void merge(int[] num1, int m, int[] num2, int n) {

		// edge case , the second array cannot be empty or dont call this method
		if (n == 0) {
			return;
		}

		int index = m + n - 1;
		int num1Len = m - 1;
		int num2Len = n - 1;

		while (index >= 0) {

			if (num1Len >= 0 && num1[num1Len] > num2[num2Len]) {
				num1[index] = num1[num1Len--];
			} else {
				num1[index] = num2[num2Len--];
			}
			// come out from the loop
			if (num2Len < 0) {
				break;
			}

			index--;
		}

	}

}
