package Lec3;

import java.util.Scanner;

public class Pattern27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int digit=1;
		int row=1;
		int space=n-1;
		while(row<=n) {
			int k=1;
			while(k<=space) {
				System.out.print("  ");
				k++;
			}
			space--;
			int j=1;
			
				if(j<=row) {
					while(j<=row) {
						System.out.print(j+" ");
						j++;
					}
				}
				j=j-2;
				
					while(j>=1) {
						System.out.print(j+" ");
						j--;
					}
				
				
			
			System.out.println();
			digit=digit+2;
			row++;
		}
		sc.close();
	}
	

}
