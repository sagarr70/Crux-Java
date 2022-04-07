package Homework;

import java.util.Scanner;

public class Pattern22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int row=n;
		int space=-1;
		while(row>=1) {
			int star=1;
			
			while(star<=row) {
				System.out.print("* ");
				star++;
			}
			int int_space=1;
			while(int_space<=space) {
				System.out.print("  ");
				int_space++;
			}
			space=space+2;
			star=1;
			if(row==n) {
				while(star<row) {
					System.out.print("* ");
					star++;
				}
					
			}
			else {
				while(star<=row) {
					System.out.print("* ");
					star++;
				}
			}
			System.out.println();
			row--;
			
		}
        sc.close();
	}

}
