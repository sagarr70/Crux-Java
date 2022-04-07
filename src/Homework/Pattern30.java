package Homework;

import java.util.Scanner;

public class Pattern30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		while(row<=n) {
			int z=5;
			while(z>=1) {
				System.out.print(z+" ");
				z--;
			}
			System.out.println();
			row++;
		}
		sc.close();

	}

}
