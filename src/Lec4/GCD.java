package Lec4;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a;
        int b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        sc.close();
        while(b%a!=0) {
        	
        		int rem=b%a;
        		b=a;
        		a=rem;
        	
        }
        System.out.println(a);
	}

}
