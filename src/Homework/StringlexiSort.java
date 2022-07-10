package Homework;

import java.util.Scanner;

public class StringlexiSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0) {
			int n=sc.nextInt();
		int a[]=new int[n];//6054854654
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				String str1=Integer.toString(a[j+1])+Integer.toString(a[j]);
				String str2=Integer.toString(a[j])+Integer.toString(a[j+1]);
				if(str1.compareTo(str2)>0) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			
	}
	
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
		System.out.println();
		t--;
		}
		sc.close();

	}

}
