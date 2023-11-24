package com.demo;

import java.util.Arrays;
import java.util.Scanner;

	public class SelectionSort {
		public static void main (String [] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the size of array");
			int length = sc.nextInt();
			int arr[] = new int[length];
		
			System.out.println("Enter the array");
			for(int i=0; i<length; i++) {
				arr[i]=sc.nextInt();
		}
		selectionSort(arr);	
	}

		private static void selectionSort(int[] arr) {
			int i, j, min, temp;
			for(i=0; i <arr.length-1; i++) {
				min =i; 
				for(j=i+1; j<arr.length; j++) {
					if(arr[j] < arr[min]) {
						min = j;
						
					}
				temp= arr[min];
				arr[min]= arr[i];
				arr[i]= temp;
				}
			}
			System.out.println(Arrays.toString(arr));
			
		}
}
