package com.demo;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int length = sc.nextInt();
		int arr[] = new int[length];
		
		System.out.println("Enter the array");
		for(int i=0; i<length; i++) {
				arr[i]=sc.nextInt();
		}
		InsertionSort(arr);	
	}

	private static void InsertionSort(int[] arr) {
		int i,j,v;

		
		for( i=1; i<arr.length; i++) {
			v=arr[i];
			j=i-1; 
			while( j>=0 && arr[j]> v ) {
				arr[j+1]= arr[j];
				j--;
			}
			arr[j+1]=v;
		}
		System.out.println(Arrays.toString(arr));
	}

}
