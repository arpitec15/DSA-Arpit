package com.dsa.recursion;

import java.util.ArrayList;
import java.util.List;

public class Q5PrintAllPatternsWithSumEqualToK {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		int[] arr = { 1, 2, 1 };
		int target_sum = 2;

		printAllPatterns(0, list, arr, target_sum, 0);

	}

	private static void printAllPatterns(int i, List<Integer> list, int[] arr, int target_sum, int current_sum) {

//		Base Condition

		if (i == arr.length) {
			if (current_sum == target_sum) {
				System.out.println(list);

			}
		}

		else {

//		include

			list.add(arr[i]);
			printAllPatterns(i + 1, list, arr, target_sum, current_sum + arr[i]);

//		exclude

			list.remove(list.size() - 1);
			current_sum -= arr[i];
			printAllPatterns(i + 1, list, arr, target_sum, current_sum + arr[i]);

			return;

		}
	}

}
