package Lec7.sorting;

import java.util.Scanner;

public class bubbl_esort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		sc.close();
		bubblesort(arr);
	}

	private static void bubblesort(int[] a) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-i-1;j++) {
			if(a[j]>a[(j+1)%a.length]) {
				int temp=a[j];
				a[j]=a[(j+1)%a.length];
				a[(j+1)%a.length]=temp;
			}}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}

}
