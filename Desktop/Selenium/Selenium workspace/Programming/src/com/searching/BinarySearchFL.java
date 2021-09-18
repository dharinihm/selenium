package com.searching;

import java.util.Arrays;

// Binary search if key is in Ascending order
public class BinarySearchFL {

	public static void main(String[] args) {
		int[] a = { 76, 9, 10, 87, 14, 16, 14 };
		Arrays.sort(a);

		System.out.println("The sorted array is:");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");

		int f = 0;
		int l = a.length - 1;
		int key = 14;
		String result = "Key is not Found";

		while (f <= l) {
			int mid = (f + l) / 2;

			if (key == a[mid]) {
				result = "Key is found @ index :"+mid;
				break;
			}

			else if (key > a[mid])
				f = mid + 1;
			else
				l = mid - 1;
		}
		
		System.out.println("\n"+result);

	}

}
