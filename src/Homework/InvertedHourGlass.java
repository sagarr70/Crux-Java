package Homework;

import java.util.Scanner;

public class InvertedHourGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int space=2*n-1;
		int row=1;
		int pattern=1;
		while(row<=2*n+1) {
		    int num=n;
		    for(int i=1;i<=pattern;i++) {
		    	System.out.print(num+" ");
		    	num--;
		    }
		    for(int i=1;i<=space;i++) {
		    	System.out.print("  ");
		    	
		    }
//		    num=n;
		   
		    if(row!=n+1) {
		    	 num++;
		    for(int i=1;i<=pattern;i++) {
		    	System.out.print(num+" ");
		    	num++;
		    }}else {
		    	 num+=2;
		    	for(int i=1;i<pattern;i++) {
			    	System.out.print(num+" ");
			    	num++;
			    }
		    }
		    if(row<n+1) {
		    	pattern++;
		    	space-=2;
		    }
		    else {
		    	pattern--;
		    	space+=2;
		    	
		    }
		    row++;
		    System.out.println();
		    
		    
		}

	}

}
