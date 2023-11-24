package com.demo;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int length = sc.nextInt();
		int arr[] = new int[length];
		
		System.out.println("Enter the array");
		for(int i=0; i<length; i++) {
				arr[i]=sc.nextInt();
		}
		quickSort(arr,0,arr.length-1);	
		System.out.println(Arrays.toString(arr));
	}

private static void quickSort(int[] arr, int start, int end) {
	// TODO Auto-generated method stub
	if(start<end) {
		int p= partition(arr,start, end);
		quickSort(arr, start, p-1);
		quickSort(arr, p+1, end);
		
	}
	
}

private static int partition(int[] arr, int first, int last) {
	// TODO Auto-generated method stub
	
	int pivot = first;
	int i=first;
	int j=last;
	while(i<j) {
		while(i<last && arr[i]<=arr[pivot]) {
			i++;
		}
		while(j>pivot && arr[j]>arr[pivot]) {
			j--;
		}
		if(i<j) {
			int temp= arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
	int temp= arr[j];
	arr[j]= arr[pivot];
	arr[pivot]= temp;
	return j;
	//return j;
}

}
