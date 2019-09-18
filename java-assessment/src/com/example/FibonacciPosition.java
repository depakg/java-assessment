package com.example;

public class FibonacciPosition {

	public static long computeFibonacciPosition(long n) {
		if ((n == 0) || (n == 1))
			return n;
		else {
			return computeFibonacciPosition(n - 1) + computeFibonacciPosition(n - 2);
		}
			
	}

	public static void main(String[] args) {
		long fibPosition= 4;
		System.out.println("The "+fibPosition+"th fibonacci number is: " + computeFibonacciPosition(fibPosition));
	}

}
