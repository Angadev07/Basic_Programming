package com.ilpbatch4.utility;

public class sumOfSeriesQn_6 {

	public static void main(String[] args) {
		int input = 3;
		sumOfFactorial(input);
	}
		private static void sumOfFactorial(int input) {
			float sum = 0;
			for (int i = 1; i <= input; i++) {
				sum = sum + (float) i / (float) factorial(i);
			}
			System.out.println("Sum Of Factorial=" + sum);
		}
	 
		private static int factorial(int n) {
			int factorial = 1;
			for (int i = 1; i <= n; i++) {
				factorial = factorial * i;
			}
			return factorial;
	 
		}
	 
		

}


 
	
