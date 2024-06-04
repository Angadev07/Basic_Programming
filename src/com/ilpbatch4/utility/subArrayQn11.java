package com.ilpbatch4.utility;

public class subArrayQn11 {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 4, 7, 7, 8, 8, 10, 5, 3, 2 };
		int sum = 5;
		System.out.println("left and right index of that subarray");
		lRIndex(arr, sum);
	}

	private static void lRIndex(int[] arr, int sum) {
		int count = 0;
		int[][] pairs = new int[arr.length][2];
		int[][] index = new int[arr.length][2];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == sum) {
					pairs[count][0] = arr[i];
					pairs[count][1] = arr[j];
					index[count][0] = i;
					index[count][1] = j;
					count++;
				}
			}
		}
		for (int k = 0; k < count; k++) {
			System.out.println("(" + pairs[k][0] + ", " + pairs[k][1] + ") left index :" + index[k][0]
					+ " right index : " + index[k][1]);

		}
	}
}
