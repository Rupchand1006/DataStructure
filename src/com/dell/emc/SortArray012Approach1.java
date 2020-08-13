package com.dell.emc;

import java.util.Arrays;

/* Given an array containing only 0's,1's and 2's, sort the array in linear time and using constant time*/

/**
 * 
 * @author Rupchand_Dewangan
 *
 */
public class SortArray012Approach1 {

	static void printArr(int arr[], int n) {
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

	public static void threeWayPartition(int[] arr, int end) {
		int i, cnt0 = 0, cnt1 = 0, cnt2 = 0;

		// Count the number of 0s, 1s and 2s in the array
		for (i = 0; i <= end; i++) {
			switch (arr[i]) {
			case 0:
				cnt0++;
				break;
			case 1:
				cnt1++;
				break;
			case 2:
				cnt2++;
				break;
			}
		}

		// Update the array
		i = 0;

		// Store all the 0s in the beginning
		while (cnt0 > 0) {
			arr[i++] = 0;
			cnt0--;
		}

		// Then all the 1s
		while (cnt1 > 0) {
			arr[i++] = 1;
			cnt1--;
		}

		// Finally all the 2s
		while (cnt2 > 0) {
			arr[i++] = 2;
			cnt2--;
		}

		// Print the sorted array
		printArr(arr, end);

	}

	// Sort an array containing 0’s, 1’s and 2’s
	public static void main(String[] args) {
		int[] A = { 0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0 };

		threeWayPartition(A, A.length - 1);
		System.out.println(Arrays.toString(A));
	}
}