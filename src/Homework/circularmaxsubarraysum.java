package Homework;

import java.util.Scanner;

public class circularmaxsubarraysum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0) {
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println(maxcircularsum(arr));
			t--;
		}
		sc.close();

	}
	public static int kadane(int[] arr) {
		int Maxi=Integer.MIN_VALUE;
		int cur_sum=0;
		for(int i=0;i<arr.length;i++) {
			
			cur_sum+=arr[i];
			Maxi=Math.max(Maxi, cur_sum);
			if(cur_sum<0) {
				cur_sum=0;
			}
			
		}
		return Maxi;
	}

	private static int maxcircularsum(int[] arr) {
		int normalkadane=kadane(arr);
		int total_sum=0;
		for(int i=0;i<arr.length;i++) {
			total_sum+=arr[i];
			arr[i]=-arr[i];
		}
		int negativekadane=kadane(arr);
		int possibleans=total_sum+negativekadane;
		return Math.max(normalkadane, possibleans);
		
		
	}

}
