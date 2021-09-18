package com.searching;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] a = { 1, 5, 25, 40 };
		int key = 8;

		if (binarySearch(a, key))
			System.out.println(key + " is found");
		else
			System.out.println(key + " is not found");
	}

	public static boolean binarySearch(int[] a, int key) {
		int low = 0;
		int high = a.length - 1;

		while (high >= low) {
			int mid = (low + high) / 2;
			if (key == a[mid])
				return true;
			else if (key > a[mid])
				low = mid + 1;
			else
				high = mid - 1;
		}
		return false;
	}
}
