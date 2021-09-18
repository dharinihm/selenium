package com.searching;

public class LinearSearch {

	public static void main(String[] args) {
		int[] a = { 10, 38, 90, 10, 12, 10 };
		int key = 10;
		String result = "Key is not Found";
		System.out.println("FirstOccurence: " + FirstOccurence(a, key));
		System.out.println("LastOccurence: " + LastOccurence(a, key));
	}

	public static String FirstOccurence(int[] a, int key) {
		String result = null;
		for (int i = 0; i < a.length; i++) {
			if (key == a[i]) {
				result = "Key is found @ " + i;
				break;
			}
		}
		return result;
	}

	public static String LastOccurence(int[] a, int key) {
		String result = null;
		for (int i = 0; i < a.length; i++) {
			if (key == a[i]) {
				result = "Key is found @ " + i;
			}
		}
		return result;
	}
}
