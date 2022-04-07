package Homework;

import java.util.Scanner;

public class Pattern29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int space=n-1;
		int i=0;
		int pattern=1;
		int count=1;
		while(i<n) {
			int j=0;
			while(j<space) {
				System.out.print("  ");
				j++;
			}
			j=0;
			
			while(j<pattern) {
				
			if(j==0||j==pattern-1) {
				System.out.print(count+" ");
			}else {
				System.out.print("0 ");
			}
			j++;}
			count++;
			i++;
			pattern+=2;
			System.out.println();
			space=space-1;
			
		}
		sc.close();

	}

}
