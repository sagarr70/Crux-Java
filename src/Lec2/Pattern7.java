package Lec2;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		while(row<=n) {
			if(row==1 || row==n) {
				int j=0;
				while(j<n) {
					System.out.print("* ");
					j++;
				}
			}
			else {
				System.out.print("* ");
				int star = n-2;
				int j=0;
				while(j<star) {
					System.out.print("  ");
					j++;
				}
				System.out.print("* ");
			}
			row++;
			System.out.println();
		}
		sc.close();

	}

}
