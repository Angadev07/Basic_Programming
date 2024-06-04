package com.ilpbatch4.utility;

public class missingNumQn7 {

	public static void main(String[] args) {
		int array[] = { 3, 5, 6, 8 };
		int limit = 10;
		missingNumber(limit, array);
	}
	private static void missingNumber(int limit, int[] array) {
		 
		for (int i = 1; i <= limit; i++) {
			int flag = 0;
			for (int j = 0; j < array.length; j++) {
				if (array[j] == i) {
					flag = 1;
				}
			}
			if (flag == 0) {
				System.out.println(i);
			}
		}
	}
}
