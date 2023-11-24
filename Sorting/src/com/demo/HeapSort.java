																			package com.demo;

import java.util.Arrays;
import java.util.Scanner;

public class HeapSort {
public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int length = sc.nextInt();
		int arr[] = new int[length];
		
		System.out.println("Enter the array");
		for(int i=0; i<length; i++) {
				arr[i]=sc.nextInt();
		}
		heapSort(arr);
		
		System.out.println(Arrays.toString(arr));
	}

private static void heapSort(int[] arr) {
	int n = arr.length;
	for(int i= n/2-1; i>=0;i--) {
		System.out.println("in first for loop"+ i + " " );
		heapify(arr,n,i);
		//5System.out.println("in first for loop"+ i + " " );
	}
	System.out.println(Arrays.toString(arr));
	
	for(int i = n-1; i>=0; i--) {
		int temp= arr[0];
		arr[0] = arr[i];
		arr[i]= temp;
		System.out.println("in second for loop"+ i + " " );
		heapify(arr,i,0);
		System.out.println("size" + i);
		System.out.println(Arrays.toString(arr));
	}
	
	// TODO Auto-generated method stub
	
}

private static void heapify(int[] arr, int n, int i) {
	int largest = i;
	int l= 2*i+1;
	int r= 2*i+2;
	
	System.out.println("in heapify" + " "+largest+ " "+ l + " "+ r +" " );
	if(l<n && arr[l] > arr[largest]) {
		largest=l;
	}
	if(r<n && arr[r] > arr[largest]) {
		largest = r;
	}
	if(largest != i) {
		int temp = arr[largest];
		
		arr[largest] = arr[i];
		arr[i] = temp;
		heapify(arr, n , largest);
	}
	
}


}
