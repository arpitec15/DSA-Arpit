package com.dsa.recursion;

public class Q1PrintNameNTime {

	public static void main(String[] args) {

		printName(10);
	}

	public static void printName(int n) {

		if (n == 0)
			return;

		System.out.println(n);
		printName(n - 1);

	}

}
