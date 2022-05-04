package Homework;

import java.util.Arrays;
import java.util.Scanner;

public class PairofRoses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0) {
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			int key=sc.nextInt();
			pairrose(arr,key);
			sc.close();
			System.out.println();
			t--;
		}

	}

	private static void pairrose(int[] arr, int key) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		int first=0;int second=0;
		boolean l=false;
		int i=0;int j=arr.length-1;
		while(i<j) {
			if(arr[i]+arr[j]==key) {
				if(!l) {
					first=arr[i];
					second=arr[j];
					l=true;
				}
				else {
					if(Math.abs(first-second)>Math.abs(arr[i]-arr[j])) {
						first=arr[i];
						second=arr[j];
					}
				}
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
		System.out.println("Deepak should buy roses whose prices are "+first+" and "+second+".");
		
	}

}
