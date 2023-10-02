package com.dsa.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q6MergeSort {

	public static void main(String[] args) {

		int arr[] = { 13, 2, 4, 1, 3, 5, 1, 2 };
		int n = arr.length;
		int low = 0;
		int high = n - 1;

		divide(arr, low, high);
		System.out.println(Arrays.toString(arr));

	}

	private static void divide(int[] arr, int low, int high) {

		if (low == high)
			return;

		int mid = (low + high) / 2;

		divide(arr, low, mid);
		divide(arr, mid + 1, high);
		merge(arr, low, mid, high);

	}

	private static void merge(int[] arr, int low, int mid, int high) {

		int left = low;
		int right = mid + 1;
		List<Integer> temp = new ArrayList<>();
		while (left <= mid && right <= high) {

			if (arr[left] < arr[right]) {
				temp.add(arr[left]);
				left++;
			} else {
				temp.add(arr[right]);
				right++;
			}

		}

		while (left <= mid) {
			temp.add(arr[left]);
			left++;

		}

		while (right <= high) {
			temp.add(arr[right]);
			right++; 
		}

		for (int i = low; i <= high; i++) {
			arr[i] = temp.get(i - low);
		}

	}

}
