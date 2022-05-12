package Homework;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysTargetSumTriplets {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int key=sc.nextInt();
		for(int i=0;i<n-2;i++) {
			_tripletsum(arr,i,n,key);
		}
		
		sc.close();

	}

	private static void _tripletsum(int[] a, int i, int n, int key) {
		int start=i+1;
		int end=n-1;
		key=key-a[i];
		while(start<end) {
			if(a[start]+a[end]==key) {
				System.out.println(a[i]+", "+a[start]+" and "+a[end]);
				start++;
				end--;
			}
			else {
				if(a[start]+a[end]<key) {
					start++;
				}
				else {
					end--;
				}
			}
		}
		
	}

}
