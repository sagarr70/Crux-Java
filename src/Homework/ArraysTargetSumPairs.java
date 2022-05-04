package Homework;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysTargetSumPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int key=sc.nextInt();
		sc.close();
		pairsum(arr,key);
		

	}

	private static void pairsum(int[] arr, int key) {
		
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			if(arr[i]+arr[j]==key) {
				System.out.println(arr[i]+" and "+arr[j]);
				i++;j--;
			}
			else {
				if(arr[i]+arr[j]<key) {
					i++;
				}
				else {
					j--;
				}
			}
		}
	}

}
