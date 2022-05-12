package Homework;

import java.util.Scanner;

public class SortingInlineartime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			arr=sortOn(arr,n);
			for(int i=0;i<n;i++) {
				System.out.print(arr[i]+" ");
			}
			sc.close();

	}

	private static int[] sortOn(int[] arr, int n) {
		int count0=0;
		int count1=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==0) {
				count0++;
			}
			else {
				if(arr[i]==1) {
					count1++;
				}
			}
		}
		
		for(int i=0;i<n;i++) {
			if(count0!=0) {
				arr[i]=0;
				count0--;
			}
			else {
				if(count1!=0) {
					arr[i]=1;
					count1--;
				}
				else {
					arr[i]=2;
				}
				
			}
		}
		return arr;
	}

}
