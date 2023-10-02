package com.dsa.recursion;

public class Q3Fibonacci {

	public static void main(String[] args) {

		for (int i = 0; i < 6; i++) {

			System.out.print(fib(i) + " ");

		}

	}

	private static int fib(int n) {

		if (n <= 1)
			return n;

		return fib(n - 1) + fib(n - 2);
	}

}
