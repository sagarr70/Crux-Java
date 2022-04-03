package Lec2;

import java.util.Scanner;

public class Pattern9 {

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
			j=0;
			while(j<star) {
				System.out.print("* ");
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
