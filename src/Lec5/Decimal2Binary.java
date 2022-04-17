package Lec5;

import java.util.Scanner;

public class Decimal2Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		sc.close();
		long binary=0;
		long digit=1;
		while(n>0) {
			binary=(long)(n%2*digit)+(binary);
			n=n/2;
			digit*=10;
			
		}
        System.out.println(binary);
	}

}
