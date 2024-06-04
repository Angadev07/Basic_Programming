
package com.ilpbatch4.utility;

public class duplicatesQn_8 {

	public static void main(String[] args) {
		int array[] = { 1, 3, 2, 1, 3,5,5, 2, 7, 1, 1 };
		arrayDuplicate(array);
	}

	private static void arrayDuplicate(int[] array) {
		boolean[] print = new boolean[array.length];

		for (int i = 0; i < array.length; i++) {
			if (!print[i]) {
				boolean isDuplicate = false;
				for (int j = i + 1; j < array.length; j++) {
					if (array[i] == array[j]) {
						isDuplicate = true;
						print[j] = true;
					}
				}
				if (isDuplicate) {
					System.out.println(array[i]);
					print[i] = true;
				}
			}
		}
	}
}