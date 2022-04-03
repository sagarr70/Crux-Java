package Lec2;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		int j=n;
		int row=n;
		for(int r=1;r<=row;r++) {
			int col=n;
			for(int c=1;c<=col;c++) {
				if(c==i || c==j) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			if(r<=n/2) {
				i++;j--;
			}
			else {
				i--;
				j++;
			}
			System.out.println();
		}
		sc.close();

	}

}
