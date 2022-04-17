package Lec5;

import java.util.Scanner;

public class DecimaltoOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int decimal=sc.nextInt();
		sc.close();
		long n=0;
		long digit=1;
		while(decimal>0) {
	        n=(long)((decimal%8)*digit)+(n);
			decimal=decimal/8;
			digit*=10;
			
		}
        System.out.println(n);
	}
	
	

}
