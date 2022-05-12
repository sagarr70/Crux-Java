package Homework;

import java.util.Scanner;

public class NextPermutation {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t= sc.nextInt();
	while(t>0) {
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		arr=nextpermu(arr,n);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		t--;
	}
	sc.close();

	}

	private static int[] nextpermu(int[] arr, int n) {
		if(n==1) {
			return arr;
		}
		else {
			int peak=-1;
			int swapele=-1;
			for(int i=arr.length-2;i>=0;i--) {
				if(arr[i]<arr[i+1]) {
					peak=i;
					break;
				}
			}
			if(peak==-1) {
				int start=0;
				int end=n-1;
				while(start<=end) {
					int temp=arr[start];
					arr[start]=arr[end];
					arr[end]=temp;
					start++;
					end--;
				}
				return arr;
			}
			else {
				
				for(int i=arr.length-1;i>=0;i--) {
					if(arr[i]>arr[peak]) {
						swapele=i;
						break;
					}
				}
				int temp=arr[peak];
				arr[peak]=arr[swapele];
				arr[swapele]=temp;
				int start=peak+1;
				int end=n-1;
				while(start<=end) {
					temp=arr[start];
					arr[start]=arr[end];
					arr[end]=temp;
					start++;
					end--;
				}
				return arr;
			}
			
		}
	}

}
