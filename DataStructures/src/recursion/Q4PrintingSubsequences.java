package com.dsa.recursion;

import java.util.ArrayList;
import java.util.List;

public class Q4PrintingSubsequences {

	public static void main(String[] args) {

		int[] arr = { 3, 2, 1 };

		List<Integer> list = new ArrayList<>();

		printSubsequences(0, list, arr);
	}

	private static void printSubsequences(int i, List<Integer> list, int[] arr) {

		// Base Condition

		if (i == arr.length) {
			if (list.size() > 0) {
				list.forEach(p -> System.out.print(p + " "));
				System.out.println();
				return;
			}

		} else {

			// includes
			printSubsequences(i + 1, list, arr);
			list.add(arr[i]);

			// excludes
			printSubsequences(i + 1, list, arr);
			list.remove(list.size() - 1);
		}

		return;
	}

}
