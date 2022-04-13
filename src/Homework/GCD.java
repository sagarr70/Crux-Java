package Homework;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        while(b%a!=0) {
        	int rem=b%a;
        	b=a;
        	a=rem;
        }
        System.out.println(a);
        
	}

}
