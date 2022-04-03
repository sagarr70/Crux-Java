package Lec2;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int i=n;
		int space=0;
		while(i>0) {
			int j=0;
			while(j<space) {
				System.out.print("  ");
				j++;
			}
				j=0;
			while(j<i) {
				System.out.print("* ");
				j++;
			}
			space=space+2;
			i--;
			System.out.println();
			
		}
		sc.close();

	}

}
