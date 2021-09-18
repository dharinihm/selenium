package com.searching;

import java.util.Arrays;

public class BinarySearchM {

	public static void main(String[] args) {
		int[] a = { 2, 5, 98, -45, 9, 45 };
		int key = 56;
		Arrays.sort(a);
		for (int arr : a) {
			System.out.print(arr + " ");
		}
		int f = 0;
		int l = a.length - 1;
		binarySearch(a, key, f, l);

	}

	public static void binarySearch(int[] a, int key, int f, int l) {

		while (l >= f) {
			int mid = (f + l) / 2;

			if (key == a[mid]) {
				System.out.println(" \n Key is found at the index " + mid);
				break;
			} else if (key > a[mid]) {
				f = mid + 1;
				binarySearch(a, key, f, l);
				break;
			} else if (key < a[mid]) {
				l = mid - 1;
				binarySearch(a, key, f, l);
				break;
			} else
				System.out.println("Key is not Found");

		}
	}

}
