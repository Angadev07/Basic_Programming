package com.ilpbatch4.utility;

public class cubicSeries {

	public static void main(String[] args) {
		int input = 5;
		fibonacci(input);
		
		

	}

	private static void fibonacci(int input) {
		int a = 1;
		int b = 2;
		int sum = 1;
		int cube = 0;
		while (b < input) {
			sum = sum + a;
			int temp = a;
			a = sum;
			sum = temp;
			b++;
			cube=cube+(sum*sum*sum);
			
			
		}
		System.out.println(cube);
	}

}
