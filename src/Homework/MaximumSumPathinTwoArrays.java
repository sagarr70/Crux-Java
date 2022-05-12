package Homework;

import java.util.Scanner;

public class MaximumSumPathinTwoArrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t= sc.nextInt();
		while(t>0) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			int arr1[]=new int[n];
			int arr2[]=new int[m];
			for(int i=0;i<n;i++) {
				arr1[i]=sc.nextInt();
			}
			for(int i=0;i<m;i++) {
				arr2[i]=sc.nextInt();
			}
			int ans=maxsum(arr1,arr2);
			
			System.out.println(ans);
			t--;
		}
		sc.close();
	}

	private static int maxsum(int[] arr1, int[] arr2) {
		int i=0;
		int j=0;
		int sum1=0;
		int sum2=0;
		int result=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				sum1+=arr1[i];
				i++;
			}
			else {
				if(arr2[j]<arr1[i]) {
					sum2+=arr2[j];
					j++;
				}
				else {
					result+=Math.max(sum2,sum1)+arr1[i];
					i++;
					j++;
					sum1=0;
					sum2=0;
				}
			}
			
			
		}
		while(i<arr1.length) {
			sum1+=arr1[i];
			i++;
		}
		while(j<arr2.length) {
			sum2+=arr2[j];
			j++;
		}
		result+=Math.max(sum2, sum1);
		return result;
		
	}

}
