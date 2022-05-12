package Homework;

import java.util.Scanner;

public class binarySearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int key=sc.nextInt();
		System.out.println(_binarysearch(arr,key));
		sc.close();

	}

	private static int _binarysearch(int[] arr, int key) {
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(arr[mid]==key) {
				return mid;
			}
			else {
				if(arr[mid]<key) {
					start=mid+1;
				}
				else {
					end=mid-1;
				}
			}
		}
		return -1;
	}

}
