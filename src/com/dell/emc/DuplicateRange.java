package com.dell.emc;

import java.util.HashMap;
import java.util.Map;
// Find the duplicate within Given Range K in Array



public class DuplicateRange {
	public static boolean hasDuplicates(int[] arr, int k) {
		// stores (element, index) pairs as (key, value) pairs
		Map<Integer, Integer> map = new HashMap<>();

		// traverse the array
		for (int i = 0; i < arr.length; i++) {
			// if the current element already exists in the map
			if (map.containsKey(arr[i])) {

				// return true if current element is repeated within range of k
				if (i - map.get(arr[i]) <= k) {
					return true;
				}
			}

			// store elements along with their indices
			map.put(arr[i], i);
		}

		// we reach here when no element is repeated within range k
		return false;
	}

	public static void main(String[] args) {
		int[] arr = { 5, 6, 8, 2, 6,4 ,9 };
		int k = 3;

		if (hasDuplicates(arr, k)) {
			System.out.println("Duplicates found");
		} else {
			System.out.println("No Duplicates found");
		}
	}
}
