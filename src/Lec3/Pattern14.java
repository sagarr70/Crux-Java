package Lec3;

import java.util.Scanner;

public class Pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int space = n-1;
		int star=1;
		int row=1;
		
		while(row<=n) {
			int int_space=1;
			while(int_space<=space) {
				System.out.print("  ");
				int_space++;
			}
			space--;
			int int_star=1;
			while(int_star<=star) {
				System.out.print("* ");
				int_star++;
			}
			star++;
			System.out.println();
			row++;
		}
		star=star-2;
		space=space+2;
		row=1;
		while(row<n) {
			int int_space=1;
			while(int_space<=space) {
				System.out.print("  ");
				int_space++;
			}
			space++;
			int int_star=1;
			while(int_star<=star) {
				System.out.print("* ");
				int_star++;
			}
			star--;
			System.out.println();
			row++;
			
			
		}
		
		sc.close();

	}

}
