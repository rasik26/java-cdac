package com.demo;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int length = sc.nextInt();
		int arr[] = new int[length];
		
		System.out.println("Enter the array");
		for(int i=0; i<length; i++) {
				arr[i]=sc.nextInt();
		}
		bubbleSort(arr);	
	}

	private static void bubbleSort(int[] arr) {
		int pass, i, temp, swapped=1; 
		for(pass= arr.length-1; pass>=0 ; pass--) {
			for(i=0; i<= pass-1; i++) {
				if(arr[i] > arr[i+1]) {
					temp = arr[i];
					arr[i]= arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
}
