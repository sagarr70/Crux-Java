package Homework;

import java.util.Scanner;

public class ProductofArrayExceptSelf {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        long arr[]=new long[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		arr=requiredproduct(arr);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();

	}

	private static long[] requiredproduct(long[] arr) {
		long left[]=new long[arr.length];
        long right[]=new long[arr.length];
        left[0]=1;
        right[arr.length-1]=1;
        for(int i=1;i<arr.length;i++) {
        	left[i]=left[i-1]*arr[i-1];
        	right[arr.length-i-1]=right[arr.length-i]*arr[arr.length-i];
        }
        for(int i=0;i<arr.length;i++) {
        	arr[i]=left[i]*right[i];
        }
        return arr;
		
	}

}
