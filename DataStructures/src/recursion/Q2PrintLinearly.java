package com.dsa.recursion;

public class Q2PrintLinearly {

	public static void main(String[] args) {
		printN(10,1);
	}

	private static void printN(int n, int i) {
		if (n == i) {
			System.out.println(n);
			return;
		}

		System.out.println(i);
		printN(n, i + 1);
	}

}
