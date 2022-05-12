package Homework;

import java.util.Scanner;

public class CalculateTheSum {

	public static void main(String[] args) {
		long M = 1000000007;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int q=sc.nextInt();
		while(q>0) {
			int x=sc.nextInt();
			int temp[]=new int[n];
			for(int i=0;i<n;i++) {
				temp[i]=arr[i]+arr[(i-x+n)%n];
			}
			for(int i=0;i<n;i++) {
				arr[i]=temp[i];
			}
			q--;
		}
		int ans=0;
		for(int i=0;i<n;i++) {
			ans+=arr[i]%M;
		}
        System.out.println(ans%M);
        sc.close();
	}

}
