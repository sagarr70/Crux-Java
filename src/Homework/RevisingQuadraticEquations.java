package Homework;

import java.util.Scanner;

public class RevisingQuadraticEquations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		sc.close();
		int D=(b*b)-(4*a*c);
		if(D<0) {
			System.out.println("Imaginary");
		}
		else {
			int x= (int) ((-b+Math.sqrt(D))/2*a);
		    int y= (int) ((-b-Math.sqrt(D))/2*a);
		    if(x==y) {
		    	System.out.println("Real and Equal");
		    	System.out.println(x+" "+y);
		    }
		    else {
		    	System.out.println("Real and Distinct");
		    	if(x<y) {
		    		System.out.println(x+" "+y);
		    	}
		    	else {
		    		System.out.println(y+" "+x);
		    	}
		    }
		}

	}

}
