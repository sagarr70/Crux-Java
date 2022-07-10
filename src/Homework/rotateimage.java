package Homework;

import java.util.Scanner;

public class rotateimage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a[i].length;j++) {
				int temp=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp;
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length/2;j++) {
				int temp=a[a[i].length-j-1][i];
				a[a[i].length-j-1][i]=a[j][i];
				a[j][i]=temp;
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
         sc.close();
	}

}
