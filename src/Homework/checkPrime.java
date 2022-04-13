package Homework;

import java.util.Scanner;

public class checkPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int flag=0;
        for(int i=2;i<=n/2;i++) {
        	if(n%i==0) {
        		flag=1;
        		
        		break;
        	}
        }
        if(flag==1) {
        	System.out.println("Not Prime");
        }
        else {
        	System.out.println("Prime");
        }
	}

}
