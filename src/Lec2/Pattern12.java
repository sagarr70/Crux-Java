package Lec2;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int space =n-1;
		int row=0;
		int star=1;
		while(row<n) {
			int j=0;
			while(j<space) {
				System.out.print("  ");
				j++;
			}
			j=1;
			while(j<=star) {
				if(j%2==0) {
				System.out.print("! ");}
				else {
					System.out.print("* ");
				}
				j++;
			}
			space=space-1;
			star=star+2;
			row++;
			System.out.println();
			
		}
		sc.close();

	}

}
