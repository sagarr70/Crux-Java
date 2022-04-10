package Lec4;

import java.util.Scanner;

public class FibonacciPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		int row=1;
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		while(row<=n){
		    for(int i=0;i<row;i++){
		        System.out.print(a+"\t");
		        int c=a+b;
		        a=b;
		        b=c;
		    }
		    row++;
		    System.out.println();

		}

	}

}
