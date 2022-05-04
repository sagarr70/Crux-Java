package Homework;

import java.util.Scanner;

public class ArraysMaxValueInArray {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int[] arr=new int[n];
       for(int i=0;i<n;i++) {
    	   arr[i]=sc.nextInt();
       }
       sc.close();
       System.out.println(maximum(arr));

	}

	private static int maximum(int[] arr) {
		int maxi=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(maxi<arr[i]) {
				maxi=arr[i];
			}
		}
		return maxi;
	}

}
