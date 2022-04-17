package Lec5;

import java.util.Scanner;

public class Binary2Decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
		
		int binary=sc.nextInt();
		sc.close();
		long n=0;
		long digit=1;
		while(binary>0) {
	        n=(long)((binary%10)*digit)+(n);
			binary=binary/10;
			digit*=2;
			
		}
        System.out.println(n);
	}

}
