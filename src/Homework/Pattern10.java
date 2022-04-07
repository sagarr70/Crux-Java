package Homework;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int star=n*2-1;
		int space=0;
		int i=0;
		while(i<n) {
			int j=0;
			while(j<space) {
				System.out.print("  ");
				j++;
			}
			space=space+1;
			j=0;
			while(j<star) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			star=star-2;
			i++;
		}
		sc.close();

	}

}
