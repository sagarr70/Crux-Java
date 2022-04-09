package Lec3;


import java.util.Scanner;

public class Pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new  Scanner(System.in);
		int n=sc.nextInt();
		int row=0;
		int star=n/2;
		int space=1;
		while(row<n) {
			if(row==0 || row==n-1) {
				int i=0;
				while(i<n) {
				System.out.print("* ");i++;}
			}
			else {
				
					int i=0;
					while(i<star) {
						System.out.print("* ");
						i++;
					}
					i=0;
					while(i<space) {
						System.out.print("  ");
						i++;
					}
					i=0;
					while(i<star) {
						System.out.print("* ");
						i++;
					}
					if(row<n/2) {
					star--;
					space+=2;
				}
					else {
						star++;
						space-=2;
					}
					
			}
			row++;
			System.out.println();
			
		
		

	   }
		sc.close();

	}

}
