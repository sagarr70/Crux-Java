package Homework;

import java.util.Scanner;

public class kroot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long t= sc.nextLong();
		while(t>0) {
			
			
			long arr1[]=new long[2];
			
			for(int i=0;i<2;i++) {
				arr1[i]=sc.nextLong();
			}
			
			long ans=_kroot(arr1);
			
			System.out.println(ans);
			t--;
		}
		sc.close();

	}

	private static long _kroot(long[] arr1) {
		long start=1;
		long end=arr1[0];
		while(start<=end) {
			long mid=start+(end-start)/2;
			if(Math.pow(mid, arr1[1])==arr1[0]) {
				return mid;
			}
			else {
				if(Math.pow(mid, arr1[1])<arr1[0]) {
					start= (mid+1);
				}
				else {
					end=(mid-1);
				}
				
			}
		}
		return start-1;
	}

}
