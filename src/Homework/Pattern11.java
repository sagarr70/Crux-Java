package Homework;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int star=1;
		int i=1;
		int space=n-1;
		while(i<=n) {
			int j=1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			j=0;
			while(j<star) {
				if(j%2 !=0) {
					System.out.print("  ");
				}else {
				System.out.print("* ");}
				j++;
			}
			star=star+2;
			space--;
			i++;
			System.out.println();
			sc.close();
		}

	}
	

}
