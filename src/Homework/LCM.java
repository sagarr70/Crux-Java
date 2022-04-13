package Homework;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int a=n1;
		int b=n2;
		sc.close();
		int gcd=0;
		while(b%a!=0) {
			int rem=b%a;
			b=a;
			a=rem;
		}
		gcd=a;
		
		System.out.println((n1*n2)/gcd);
	}

}
