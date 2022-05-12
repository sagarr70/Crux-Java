package Homework;

import java.util.Scanner;

public class squareroot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(sqrt(n));
		sc.close();
				

	}

	private static int sqrt(int n) {
		
		int start=1;
		int end=(n/2)-1;
		
		while(start<=end) {
			int mid=start+(end-start)/2;
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
