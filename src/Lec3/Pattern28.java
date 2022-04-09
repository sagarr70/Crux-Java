package Lec3;

import java.util.Scanner;

public class Pattern28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int mid=1;
		int row=1;
		int space=n-1;
		while(row<=n) {
			int k=1;
			while(k<=space) {
				System.out.print("  ");
				k++;
			}
			space--;
			int p=row;
			while(p<=mid) {
				System.out.print(p+" ");
				p++;
			}
			p=p-2;
			while(p>=row) {
				System.out.print(p+" ");
				p--;
			}
			mid=mid+2;
			row++;
			System.out.println();
			
			
			
				
		}
		sc.close();

	}

}
