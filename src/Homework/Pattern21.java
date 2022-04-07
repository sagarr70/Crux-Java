package Homework;

import java.util.Scanner;

public class Pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int space=n*2-3;
        int row=1;
        while(row<=n) {
        	int star=1;
        	while(star<=row) {
        		System.out.print("* ");
        		star++;
        	}
        	int int__space=1;
        	while(int__space<=space) {
        		System.out.print("  ");
        		int__space++;
        	}
        	star=1;
        	if(row!=n) {
        	while(star<=row) {
        		System.out.print("* ");
        		star++;
        	}}
        	else {
        		while(star<row) {
            		System.out.print("* ");
            		star++;
            	}
        	}
        	System.out.println();
        	row++;
        	space-=2;
        	
        }
        sc.close();
        
        
        }

}
