package Homework;

import java.util.Scanner;

public class squareroot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		System.out.println(sqrt(n));
		sc.close();
				

	}

	private static long sqrt(long n) {
		if(n==1)
		{
			return 1;
		}
		long start=1;
		long end=(n/2);
		
		while(start<=end) {
			long mid=start+(end-start)/2;
			if(mid*mid==n) {
				return mid;
				
			}
			else {
				if(mid*mid<n) {
					start=mid+1;
				}
				else {
					end=mid-1;
				}
			}
		}
		return start-1;
	}

}
