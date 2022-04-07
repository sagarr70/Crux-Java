package Homework;

import java.util.Scanner;

public class Pattern31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int star_idx=1;
		while(row<=n) {
			int z=5;
			while(z>=1) {
				if(z==star_idx) {
					System.out.print("* ");
					star_idx++;
					
				}
				else {
				System.out.print(z+" ");}
				z--;
			}
			System.out.println();
			row++;
		}
		sc.close();

	}

}
