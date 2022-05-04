package Homework;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int find=sc.nextInt();
		sc.close();
		System.out.println(linearsearch(arr,find));

	}

	private static int linearsearch(int[] arr, int find) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==find) {
				return i;
			}
		}
		return -1;
		
	}

}
