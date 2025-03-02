package com.learn.dsa.basic.arrays;

import java.util.Arrays;

public class LargestElementInTheArray {
	
	
	
	public static void main(String[] args) {
		
		LargestElementInTheArray obj = new LargestElementInTheArray();
		int[]arr = {23,67,78,-23,56,0,1};
		System.out.println(obj.largestElementInTheArray(arr));
		System.out.println(obj.largestElementInTheArrayUsingStreams(arr));
	}
	
	private int largestElementInTheArrayUsingStreams(int[] arr) {
		
		return Arrays.stream(arr).max().getAsInt();
	}

	private int largestElementInTheArray(int[] arr) {
		int num=0;
		
		for(int i: arr) {
			if(num<i) {
				num=i;
			}
		}
		return num;
		
	}

}
