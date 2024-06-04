package com.ilpbatch4.utility;
public class sumOfSeriesQn5 {
	public static void main(String[] args) {
		int input = 5;
		seriesSum(input);
	}
	private static void seriesSum(int input) {
		int count = 1;
		int total = 0;
		int variable=1;
		for (int i = 1; i <= input; i++) {
			if (count % 2 == 0) {
				
				total =  total - (int)(Math.pow(i, variable));
				i++;
				count++;
			} else {
				total = total +(int)(Math.pow(i, variable));
				i++;
				count++;
			}
			variable++;
		}
		
		System.out.println(total);
	}
	
}