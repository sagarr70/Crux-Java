package Lec4;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ncr= N!/((N-r)!*(r!))
//		Nc(r+1)= ((n-r)/(r+1))*(Ncr)
// n->row number r -> element number (indexing start from 0)
		   Scanner sc=new Scanner(System.in);
	       int n=sc.nextInt();
	       sc.close();
	       int row=0;
	       while(row<n){
	           int i=0;
	           int ncr=1;
	           while(i<=row){
	        	   System.out.print(ncr+"\t");
	              ncr = ((row-i)*(ncr))/(i+1);
	               i++;
	           }
	           System.out.println();
	           row++;
	       }

	}

}
