package Lec3;

import java.util.Scanner;

public class PatternRhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int num=1;
		int row=1;
		int row_val=1;
		int space=n-1;
		while(row<=n*2-1) {
			int i_space=1;
			while(i_space<=space) {
				System.out.print("\t");
				i_space++;
			}
			int j=row_val;
			while(j<=num) {
				System.out.print(j+"\t");
				j++;
			}
			j=num-1;
			while(j>=row_val) {
				System.out.print(j+"\t");
				j--;
			}
			if(row<n) {
				num+=2;
				row_val++;
				space--;
			}
			else {
				num-=2;
				row_val--;
				space++;
			}
			row++;
			System.out.println();
		}
		sc.close();
	}

}
