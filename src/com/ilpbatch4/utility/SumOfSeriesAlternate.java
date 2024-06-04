package com.ilpbatch4.utility;

import java.util.Scanner;

public class SumOfSeriesAlternate {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the limit");
		int n=s.nextInt();
		sumfunction(n);
		
		 s.close();
	}
		
	private static void sumfunction(int n) {
		int sum=0;
		int flag=0;
		for(int i=0;i<=n;i++) {
			if(i%2==1) {
				if(flag==0) {
					sum=sum+i;
					flag=1;
				}
				else {
					sum=sum-i;
					flag=0;
				}
				
			}
			
		}
		System.out.println("Result :"+sum);

	}

}
