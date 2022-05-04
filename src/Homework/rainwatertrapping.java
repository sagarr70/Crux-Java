package Homework;

import java.util.Scanner;

public class rainwatertrapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0) {
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println(rainwaterharvesting(arr,n));
			
			
			t--;
		}
		sc.close();

	}

	private static int rainwaterharvesting(int[] arr, int n) {
     
		int[] left_max=new int[n];
		int[] right_max=new int[n];
		left_max[0]=arr[0];
		right_max[n-1]=arr[n-1];
		for(int i=1;i<n;i++) {
			left_max[i]=Integer.max(left_max[i-1],arr[i]);
			right_max[n-1-i]=Integer.max(right_max[n-i],arr[n-1-i]);
		}
		int ans=0;
		for(int i=0;i<n;i++) {
			ans+=Math.abs(Integer.min(left_max[i],right_max[i])-arr[i]);
		}
		return ans;
		
	}

}
