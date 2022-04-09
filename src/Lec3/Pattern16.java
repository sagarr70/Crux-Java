package Lec3;

import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new  Scanner(System.in);
		int n=sc.nextInt();
		int space=n-1;
		int star=n;
		int row=0;
		while(row<(2*n-1)) {
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
			if(row<n-1) {
				space--;
				star--;
			}else {
				space++;
				star++;
			}
			row++;
			System.out.println();
			
		}
		sc.close();
		
	}

}
